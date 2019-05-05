package com.hexadecimal.weatherapp.network.response

import com.hexadecimal.weatherapp.network.dto.CityDTO
import com.hexadecimal.weatherapp.network.dto.WeatherDTO


// Created by Melih KOK
// kokmelih@gmail.com
// 2019-05-05 - 11:19

class WeatherByCityNameResponse(
    val cod: String,
    val message: String,
    val cnt: Int,
    val list: List<WeatherDTO>,
    val city: CityDTO
)