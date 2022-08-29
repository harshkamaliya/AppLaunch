package com.example.applaunch.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class FeelsLikeDTO(

	@field:SerializedName("day")
	val day: Any? = null,

	@field:SerializedName("night")
	val night: Any? = null,

	@field:SerializedName("eve")
	val eve: Any? = null,

	@field:SerializedName("morn")
	val morn: Any? = null
)