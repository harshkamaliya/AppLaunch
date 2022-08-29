package com.example.applaunch

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.example.applaunch.Model.ResponseDTO
import com.example.applaunch.Service.weatherAPI
import com.example.applaunch.Service.weatherAPIService
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_wheather.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class WheatherActivity : AppCompatActivity() {
    val lan=12.9083f
    val lon=77.652f
    val units="imperial"
    val appid="b143bb707b2ee117e62649b358207d3e"
    val temparature="Temp"
    val weatherNew="Weather"
    val Humidity="Humidity"
    val WindSpeed="WindSpeed"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wheather)
        setSupportActionBar(toolbar2)
        initData()
    }
    fun initData(){
        val newservice =weatherAPIService.getInstance().create(weatherAPI::class.java)
        newservice.getData(lan,lon,units,appid).enqueue(object :Callback<ResponseDTO>{
            override fun onResponse(call: Call<ResponseDTO>, response: Response<ResponseDTO>) {
                Log.e("MainActivity", "onResponse $response")

                if (response!=null)
                {
                    temp.text= temparature+" "+response.body()?.current?.temp.toString()
                    weather.text= weatherNew+" "+ response.body()?.current?.weather?.get(0)?.main.toString()
                    humidity.text=Humidity+" "+response.body()?.current?.humidity.toString()
                    windSpeed.text=WindSpeed+" "+ response.body()?.current?.windSpeed.toString()

                }


            }

            override fun onFailure(call: Call<ResponseDTO>, t: Throwable) {
                Log.e("MainActivity", "onResponse $t")

            }

        })


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menu_logout, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.miLogOut -> {
                check()

                true
            }
            else -> super.onOptionsItemSelected(item)
        }


    }

    fun check()
    {
        SharePreference.isUserLogOut(this@WheatherActivity)
        val intent = Intent(
            this@WheatherActivity,MainActivity::class.java
        )
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)


    }




}