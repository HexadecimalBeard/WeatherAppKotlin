package com.hexadecimal.weatherapp.network

import com.hexadecimal.weatherapp.network.response.WeatherByCityNameResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


// Created by Melih KOK
// kokmelih@gmail.com
// 2019-05-05 - 11:53
interface WeatherService {

    @GET("data/{apiVersion}/forecast/hourly")
    fun getWeatherByCityName(
        @Path("apiVersion") apiVersion: String,
        @Query("q") cityName: String,
        @Query("appid") appId: String
    ): Call<WeatherByCityNameResponse>


}