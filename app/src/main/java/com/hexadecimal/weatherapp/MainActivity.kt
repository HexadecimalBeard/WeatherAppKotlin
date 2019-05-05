package com.hexadecimal.weatherapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.hexadecimal.weatherapp.network.RetrofitClient
import com.hexadecimal.weatherapp.network.WeatherService
import com.hexadecimal.weatherapp.network.response.WeatherByCityNameResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity(), Callback<WeatherByCityNameResponse> {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        with(RetrofitClient.getInstance().create(WeatherService::class.java)) {
            getWeatherByCityName("2.5",
                    "Ankara",
                    "b3e685b738ea7ba57145cb241d29f2db")
                    .enqueue(this@MainActivity)
        }

    }

    override fun onFailure(call: Call<WeatherByCityNameResponse>, t: Throwable) {
        t.printStackTrace()
        Toast.makeText(this@MainActivity, "Failure", Toast.LENGTH_SHORT).show()
    }

    override fun onResponse(call: Call<WeatherByCityNameResponse>,
                            response: Response<WeatherByCityNameResponse>) {


        Toast.makeText(this@MainActivity, response.body()?.city?.name, Toast.LENGTH_SHORT).show()
    }
}
