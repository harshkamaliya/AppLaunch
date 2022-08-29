package com.example.applaunch

import android.view.View
import com.example.applaunch.DataBase.TaskEntity

interface OnRowClick {

    fun onEditClick(taskEntity: TaskEntity)
    fun onDeleteClick(taskEntity: TaskEntity)
    fun onItemClick(view:View)
}