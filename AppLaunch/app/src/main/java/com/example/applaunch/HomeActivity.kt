package com.example.applaunch

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.applaunch.DataBase.DataBaseTask
import com.example.applaunch.DataBase.TaskDao
import com.example.applaunch.DataBase.TaskEntity
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.item_layout.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeActivity : AppCompatActivity(), OnRowClick {
    private val task = mutableListOf<TaskEntity>()
    private lateinit var dataBase: DataBaseTask
    private lateinit var dataAccessObject: TaskDao
    lateinit var newAdapter: AdapterTask



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        setSupportActionBar(toolbar)

        dataBase = DataBaseTask.getDataBase(this)
        dataAccessObject = dataBase.getTaskDao()
        newAdapter = AdapterTask(task, this)

        recycleViewOfTaskList.layoutManager = LinearLayoutManager(this)
        recycleViewOfTaskList.adapter = newAdapter

        dataAccessObject.getTask().observe(this, Observer {
            val newTask = it;
            task.addAll(newTask)
            newAdapter.notifyDataSetChanged()


        })

        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(0, ItemTouchHelper.RIGHT){
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {

                TODO("Not yet implemented")
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                val item=task.get(viewHolder.adapterPosition)
                task.removeAt(viewHolder.adapterPosition)
                newAdapter.notifyItemRemoved(viewHolder.adapterPosition)
                CoroutineScope(Dispatchers.IO).launch {
                    dataAccessObject.deleteTask(item)

                }


                Toast.makeText(this@HomeActivity,"Delete",Toast.LENGTH_SHORT).show()
            }

        }).attachToRecyclerView(recycleViewOfTaskList)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        getMenuInflater().inflate(R.menu.menu_main, menu)
        return true

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.miCompose -> {
                launchFragment()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    private fun launchFragment() {
        val intent = Intent(this, FormActivity2::class.java)
        startActivity(intent)


    }

    override fun onEditClick(taskEntity: TaskEntity) {
//        ivEdit.setOnClickListener {
//
//            val intent = Intent(this, FormActivity2::class.java)
//            intent.putExtra("id", taskEntity.id)
//            startActivity(intent)
//
//        }

    }


    override fun onDeleteClick(taskEntity: TaskEntity) {


//        ivDelete.setOnClickListener {
//
//
//            CoroutineScope(Dispatchers.IO).launch {
//                dataAccessObject.deleteTask(taskEntity)
//
//            }
//
//
//        }

    }

    override fun onItemClick(view: View) {
        Toast.makeText(this@HomeActivity,"Position",Toast.LENGTH_SHORT).show()
        val intent = Intent(this, WheatherActivity::class.java)
        startActivity(intent)


    }




}