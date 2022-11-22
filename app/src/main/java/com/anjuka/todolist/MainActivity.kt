package com.anjuka.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var todoAdapter : TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todoAdapter = TodoAdapter(mutableListOf())

        rv_todo.adapter = todoAdapter
        rv_todo.layoutManager = LinearLayoutManager(this)

        btn_add_todo.setOnClickListener {
            val todoTitle = et_todo_title.text.toString()
            if (todoTitle.isNotEmpty()){
                val todo = Todo(todoTitle, false)
                todoAdapter.addTodo(todo)
                et_todo_title.text.clear()
            }
        }

        btn_delete_todo.setOnClickListener {
            todoAdapter.deleteDoneTodos()
        }
    }
}