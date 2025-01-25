package com.example.orange_ji.domain.model

data class TodoResponse(
    val todos: List<Todo>,
    val total: Int,
    val skip: Int,
    val limit: Int
)

data class Todo(
    val id: Int,
    val todo: String,
    val completed: Boolean,
    val userId: Int
)
