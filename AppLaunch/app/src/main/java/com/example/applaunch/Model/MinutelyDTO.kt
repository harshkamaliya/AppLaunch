package com.example.applaunch.Model

import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class MinutelyDTO(

	@field:SerializedName("dt")
	val dt: Int? = null,

	@field:SerializedName("precipitation")
	val precipitation: Any? = null
)