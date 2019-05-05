package com.hexadecimal.weatherapp.network.dto

data class WeatherDetailDTO(
    val id: Long,
    val main: String,
    val description: String,
    val icon: String
)
