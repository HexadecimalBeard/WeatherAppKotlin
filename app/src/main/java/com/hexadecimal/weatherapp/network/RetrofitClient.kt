package com.hexadecimal.weatherapp.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


// Created by Melih KOK
// kokmelih@gmail.com
// 2019-05-05 - 11:15

class RetrofitClient {

    companion object {

        fun getInstance(): Retrofit {

            return Retrofit.Builder()
                .baseUrl("https://api.openweathermap.org/")
                .addConverterFactory(GsonConverterFactory.create()).build()
        }
    }
}