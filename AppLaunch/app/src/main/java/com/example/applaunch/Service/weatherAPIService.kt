package com.example.applaunch.Service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object weatherAPIService {

    private val BASE_URL="https://api.openweathermap.org/"


    fun getInstance(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }


}