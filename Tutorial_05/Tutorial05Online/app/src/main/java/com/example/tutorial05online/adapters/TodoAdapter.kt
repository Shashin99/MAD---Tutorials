package com.example.tutorial05online.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.tutorial05online.R
import com.example.tutorial05online.database.TodoDatabase
import com.example.tutorial05online.database.entities.Todo
import com.example.tutorial05online.database.repositories.TodoRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class TodoAdapter : RecyclerView.Adapter<TodoAdapter.ViewHolder>() {
    lateinit var data: List<Todo>
    lateinit var context: Context
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cbTodo: CheckBox
        val ivDelete: ImageView
        init {
            cbTodo = view.findViewById(R.id.cbTodo)
            ivDelete = view.findViewById(R.id.ivDelete)
        }
    }
    fun setData(data: List<Todo>, context: Context) {
        this.data = data
        this.context = context
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.view_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount():Int {
        return data.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cbTodo.text = data[position].item
        holder.ivDelete.setOnClickListener {
            if(holder.cbTodo.isChecked){
                val repository = TodoRepository(TodoDatabase.getInstance(context))
                holder.ivDelete.setImageResource(R.drawable.delete_before)
                CoroutineScope(Dispatchers.IO).launch {
                    repository.delete(data[position])
                    val data = repository.getAllTodos()
                    withContext(Dispatchers.Main) {
                        setData(data, context)
                        holder.ivDelete.setImageResource(R.drawable.delete)
                    }
                }
            }else{
                Toast.makeText(context,"Cannot delete unmarked Todo items",Toast.LENGTH_LONG).show()
            }
        }
    }
}


