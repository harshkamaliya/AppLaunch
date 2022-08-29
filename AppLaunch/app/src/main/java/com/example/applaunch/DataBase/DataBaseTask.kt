package com.example.applaunch.DataBase

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [TaskEntity::class], version = 1,exportSchema = false)
abstract class DataBaseTask : RoomDatabase() // extending database to RoomDataBase
{

    abstract fun getTaskDao(): TaskDao // object of DAO

    companion object {

        private var INSTANCE: DataBaseTask? = null

        fun getDataBase(context: Context): DataBaseTask {

            if (INSTANCE==null)
            {
                val builder = Room.databaseBuilder(context.applicationContext,DataBaseTask::class.java,"ToDo")
                builder.fallbackToDestructiveMigration()
                INSTANCE = builder.build()
                return INSTANCE!!
            }else{

                return INSTANCE !!
            }




        }

    }


}