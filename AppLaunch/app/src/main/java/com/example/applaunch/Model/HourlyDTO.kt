package com.example.applaunch.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class HourlyDTO(

	@field:SerializedName("dt")
	val dt: Int? = null,

	@field:SerializedName("temp")
	val temp: Float? = null,

	@field:SerializedName("feels_like")
	val feelsLike: Float? = null,

	@field:SerializedName("pressure")
	val pressure: Int? = null,

	@field:SerializedName("humidity")
	val humidity: Int? = null,

	@field:SerializedName("dew_point")
	val dewPoint: Float? = null,

	@field:SerializedName("uvi")
	val uvi: Float? = null,

	@field:SerializedName("clouds")
	val clouds: Int? = null,

	@field:SerializedName("visibility")
	val visibility: Int? = null,

	@field:SerializedName("wind_speed")
	val windSpeed: Float? = null,

	@field:SerializedName("wind_deg")
	val windDeg: Int? = null,

	@field:SerializedName("wind_gust")
	val windGust: Float? = null,

	@field:SerializedName("weather")
	val weather: List<WeatherDTO?>? = null,

	@field:SerializedName("pop")
	val pop: Any? = null,

	@field:SerializedName("rain")
	val rain: RainDTO? = null
)