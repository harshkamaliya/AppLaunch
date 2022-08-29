package com.example.applaunch

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.applaunch.DataBase.TaskEntity
import kotlinx.android.synthetic.main.item_layout.view.*

class ViewHolderTask(private val view: View, val listener: OnRowClick):RecyclerView.ViewHolder(view) {

    fun setData(taskEntity: TaskEntity) {

        view.apply {

            tvFirstName.text = taskEntity.firstName.toString()
            tvLastName.text = taskEntity.lastName.toString()
            tvEmail.text = taskEntity.email.toString()

//            ivEdit.setOnClickListener {
//                listener.onEditClick(taskEntity)
//            }
//
//            ivDelete.setOnClickListener {
//                listener.onDeleteClick(taskEntity)
//            }
            cardView.setOnClickListener {
                listener.onItemClick(view)
            }


        }
    }



}