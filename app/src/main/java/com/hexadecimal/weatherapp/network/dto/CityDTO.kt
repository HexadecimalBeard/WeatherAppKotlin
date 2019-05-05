package com.hexadecimal.weatherapp.network.dto

data class CityDTO(
    val id: Long,
    val name: String,
    val coord: CoordDTO,
    val country: String
)
