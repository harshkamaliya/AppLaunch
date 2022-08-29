package com.example.applaunch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLogin.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View?) {
                // Do some work here

                if(edUserName.text.toString().equals("testapp@google.com") && edPassword.text.toString().equals("Test@123456") )
                {
                    Toast.makeText(this@MainActivity,"Redirecting",Toast.LENGTH_SHORT).show()
                    SharePreference.isUserLoggedIn(this@MainActivity)

                    val intent = Intent(this@MainActivity,HomeActivity::class.java)
                    intent.putExtra("key", "Kotlin")
                    startActivity(intent)

                }else{
                    Toast.makeText(this@MainActivity,"invalid credentials",Toast.LENGTH_SHORT).show()

                }



            }

        })

    }
}