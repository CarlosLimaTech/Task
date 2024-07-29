package com.example.task.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.task.data.model.Task
import com.example.task.data.repository.TasksRepository
import com.example.task.dto.TaskDto

class MainViewModel: ViewModel() {

    private val repository = TasksRepository()

    private val _tasks = MutableLiveData<List<TaskDto>>()

    val tasks: LiveData<List<TaskDto>>get() {
            return _tasks
    }

    init{
        loadData()
    }

    private fun loadData() {
        /*
        val taskList = repository.findAll()
        val taskDtoList = taskList.map { task: Task ->  TaskDto(task.id, task.description, task.isCompleted) }
*/
        val taskDtoList = listOf(
            TaskDto(1, "Arrumar cama"),
            TaskDto(2, "Lavar roupa")
        )
        _tasks.value = taskDtoList
    }
}