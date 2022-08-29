package com.example.applaunch.Service

import com.example.applaunch.Model.ResponseDTO
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

public interface weatherAPI {

    // "https://api.openweathermap.org/data/2.5/onecall?lat=12.9082847623315&lon=77.65197822993314&units=imperial&appid=b143bb707b2ee117e62649b358207d3e"

    @GET("data/2.5/onecall")
    fun getData(
        @Query("lat") lat:Float,
        @Query("lon") lon:Float,
        @Query("units") units:String,
        @Query("appid") appid:String
    ) : Call<ResponseDTO>

}