package com.example.applaunch.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CurrentDTO(

	@field:SerializedName("dt")
	val dt: Int? = null,

	@field:SerializedName("sunrise")
	val sunrise: Int? = null,

	@field:SerializedName("sunset")
	val sunset: Int? = null,

	@field:SerializedName("temp")
	val temp: Any? = null,

	@field:SerializedName("feels_like")
	val feelsLike: Any? = null,

	@field:SerializedName("pressure")
	val pressure: Int? = null,

	@field:SerializedName("humidity")
	val humidity: Int? = null,

	@field:SerializedName("dew_point")
	val dewPoint: Any? = null,

	@field:SerializedName("uvi")
	val uvi: Any? = null,

	@field:SerializedName("clouds")
	val clouds: Int? = null,

	@field:SerializedName("visibility")
	val visibility: Int? = null,

	@field:SerializedName("wind_speed")
	val windSpeed: Any? = null,

	@field:SerializedName("wind_deg")
	val windDeg: Int? = null,

	@field:SerializedName("weather")
	val weather: List<WeatherDTO?>? = null
)