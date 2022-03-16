package com.apps.fullandroidcourseclassa.ui.todolist

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.apps.fullandroidcourseclassa.R
import com.apps.fullandroidcourseclassa.data.db.model.Todo
import com.apps.fullandroidcourseclassa.adapters.TodoAdapter
import com.apps.fullandroidcourseclassa.databinding.ActivityTodoListExampleBinding

class TodoListExample : Fragment() {
    private var _binding: ActivityTodoListExampleBinding? = null
    // This property is only valid between onCreateView and
// onDestroyView.
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ActivityTodoListExampleBinding.inflate(inflater, container, false)
        val view = binding.root
        var todoList = mutableListOf(
            Todo("Buy Pizza", false),
            Todo("Buy Burger", false),
            Todo("Buy Pepsi", false),
            Todo("Study Python", false),
            Todo("Take Android Exam", false),
            Todo("Visit Cairo", false),
            Todo("Solve the android task", false),
            Todo("Give Android Session1", false),
            Todo("Give Android Session2", false),
            Todo("Give Android Session3", false),
            Todo("Give Android Session4", false),
            Todo("Give Android Session5", false),
            Todo("Give Android Session6", false),
            Todo("Give Android Session6", false),
        )
        val adapter = TodoAdapter(todoList)
        binding.rvTodo.adapter = adapter
        binding.rvTodo.layoutManager = LinearLayoutManager(activity)
        binding.btnAddTodo.setOnClickListener {
            val newTodoTitle = binding.etTodo.text.toString()
            val newTodo = Todo(newTodoTitle, false)
            todoList.add(newTodo)
//            adapter.notifyDataSetChanged() // Refresh the whole adapter
            adapter.notifyItemInserted(todoList.size - 1)  // Insert only without refresh
            binding.etTodo.text.clear()
        }
        return view
    }
}