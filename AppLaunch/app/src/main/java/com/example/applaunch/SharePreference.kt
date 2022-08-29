package com.example.applaunch

import android.content.Context

object SharePreference {

    val PreferenceName = SharePreference.javaClass.name

    private val PreferenceRemoteConfig = "PreferenceRemoteConfig"

    fun isUserLoggedIn(context: Context){

        val sp = context.getSharedPreferences(PreferenceName, Context.MODE_PRIVATE)
        var editor = sp.edit()
        editor.putBoolean("status",true)
        editor.commit()


    }

    fun isUserLogOut(context: Context){
        val sp = context.getSharedPreferences(PreferenceName, Context.MODE_PRIVATE)
        var editor = sp.edit()
        editor.putBoolean("status",false)
        editor.commit()


    }






}