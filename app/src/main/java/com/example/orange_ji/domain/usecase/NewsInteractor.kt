package com.example.orange_ji.domain.usecase

import com.example.orange_ji.domain.model.TodoResponse
import com.example.orange_ji.domain.repository.INewsRepository
import com.example.orange_ji.utils.DataState
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsInteractor @Inject constructor(val repository: INewsRepository) : NewsUseCase {

    override suspend fun getNews(): Flow<DataState<TodoResponse>> =
        repository.getNews()

}