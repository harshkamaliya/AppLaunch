package com.example.applaunch.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class WeatherDTO(

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("main")
	val main: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("icon")
	val icon: String? = null
)