package com.example.orange_ji.domain.repository

import com.example.orange_ji.domain.model.TodoResponse
import com.example.orange_ji.utils.DataState
import kotlinx.coroutines.flow.Flow

interface INewsRepository {
    suspend fun getNews(): Flow<DataState<TodoResponse>>
}