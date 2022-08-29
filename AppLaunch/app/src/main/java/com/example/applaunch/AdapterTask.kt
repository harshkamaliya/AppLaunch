package com.example.applaunch

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.applaunch.DataBase.TaskEntity

class AdapterTask(private val repo: List<TaskEntity>, private val listener: OnRowClick):RecyclerView.Adapter<ViewHolderTask>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderTask {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolderTask(view, listener)
    }

    override fun onBindViewHolder(holder: ViewHolderTask, position: Int) {
        holder.setData(repo[position])

    }

    override fun getItemCount(): Int {
        return repo.size
    }
}