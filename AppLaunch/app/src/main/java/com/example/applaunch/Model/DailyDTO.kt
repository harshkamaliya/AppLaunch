package com.example.applaunch.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class DailyDTO(

	@field:SerializedName("dt")
	val dt: Int? = null,

	@field:SerializedName("sunrise")
	val sunrise: Int? = null,

	@field:SerializedName("sunset")
	val sunset: Int? = null,

	@field:SerializedName("moonrise")
	val moonrise: Int? = null,

	@field:SerializedName("moonset")
	val moonset: Int? = null,

	@field:SerializedName("moon_phase")
	val moonPhase: Float? = null,

	@field:SerializedName("temp")
	val temp: TempDTO? = null,

	@field:SerializedName("feels_like")
	val feelsLike: FeelsLikeDTO? = null,

	@field:SerializedName("pressure")
	val pressure: Int? = null,

	@field:SerializedName("humidity")
	val humidity: Int? = null,

	@field:SerializedName("dew_point")
	val dewPoint: Float? = null,

	@field:SerializedName("wind_speed")
	val windSpeed: Float? = null,

	@field:SerializedName("wind_deg")
	val windDeg: Int? = null,

	@field:SerializedName("wind_gust")
	val windGust: Any? = null,

	@field:SerializedName("weather")
	val weather: List<WeatherDTO?>? = null,

	@field:SerializedName("clouds")
	val clouds: Int? = null,

	@field:SerializedName("pop")
	val pop: Any? = null,

	@field:SerializedName("rain")
	val rain: Any? = null,

	@field:SerializedName("uvi")
	val uvi: Any? = null
)