package com.example.tutorial05online.database.repositories

import com.example.tutorial05online.database.TodoDatabase
import com.example.tutorial05online.database.entities.Todo

class TodoRepository(
    private val db: TodoDatabase
) {
    suspend fun insert(todo: Todo) = db.getTodoDao().insertTodo(todo)
    suspend fun delete(todo: Todo) = db.getTodoDao().delete(todo)
    fun getAllTodos() =db.getTodoDao().getAllTodos()

}