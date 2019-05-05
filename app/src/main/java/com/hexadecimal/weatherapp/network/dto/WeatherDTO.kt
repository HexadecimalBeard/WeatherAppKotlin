package com.hexadecimal.weatherapp.network.dto

import com.google.gson.annotations.SerializedName


data class WeatherDTO(val dt: String,
                      val main: MainDTO,
                      val weather: List<WeatherDetailDTO>,
                      val clouds: CloudsDTO,
                      val wind: WindDTO,
                      val rain: RainDTO,
                      val sys: SysDTO,
                      @SerializedName("dt_txt")
              val dtTxt: String)
