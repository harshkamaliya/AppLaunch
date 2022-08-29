package com.example.applaunch.DataBase

import androidx.lifecycle.LiveData
import androidx.room.*


@Dao
interface TaskDao {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insertTask(taskEntity: TaskEntity)

    @Query("Select * from task_table")
    fun getTask(): LiveData<List<TaskEntity>>

    @Delete
    fun deleteTask(taskEntity: TaskEntity)

    @Update
    fun updateTask(taskEntity: TaskEntity)





}