package com.example.applaunch.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class ResponseDTO(

	@field:SerializedName("lat")
	val lat: Float? = null,

	@field:SerializedName("lon")
	val lon: Float? = null,

	@field:SerializedName("timezone")
	val timezone: String? = null,

	@field:SerializedName("timezone_offset")
	val timezoneOffset: Int? = null,

	@field:SerializedName("current")
	val current: CurrentDTO? = null,

	@field:SerializedName("minutely")
	val minutely: List<MinutelyDTO?>? = null,

	@field:SerializedName("hourly")
	val hourly: List<HourlyDTO?>? = null,

	@field:SerializedName("daily")
	val daily: List<DailyDTO?>? = null
)