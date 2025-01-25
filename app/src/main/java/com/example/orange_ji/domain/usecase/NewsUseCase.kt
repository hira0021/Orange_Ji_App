package com.example.orange_ji.domain.usecase

import com.example.orange_ji.domain.model.TodoResponse
import com.example.orange_ji.utils.DataState
import kotlinx.coroutines.flow.Flow

interface NewsUseCase {

    suspend fun getNews(): Flow<DataState<TodoResponse>>

}