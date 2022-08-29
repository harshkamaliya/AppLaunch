package com.example.applaunch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.applaunch.DataBase.DataBaseTask
import com.example.applaunch.DataBase.TaskDao
import com.example.applaunch.DataBase.TaskEntity
import kotlinx.android.synthetic.main.activity_form2.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class FormActivity2 : AppCompatActivity() {


    private lateinit var dataBase: DataBaseTask
    private lateinit var dataAccessObject: TaskDao

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form2)

        dataBase = DataBaseTask.getDataBase(this)
        dataAccessObject = dataBase.getTaskDao()

        btnSaveDetails.setOnClickListener {
            val firstName = edFirstName.text.toString()
            val lastName = edLastName.text.toString()
            val email =edEmailId.text.toString()
            val task =TaskEntity(firstName,lastName,email)
            CoroutineScope(Dispatchers.IO).launch {
                dataAccessObject.insertTask(task)
            }
            Toast.makeText(this@FormActivity2,"Saved",Toast.LENGTH_SHORT).show()

            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)







        }

    }
}