package com.example.orange_ji.data.datasource

import com.example.orange_ji.data.remote.NewsService
import com.example.orange_ji.domain.model.TodoResponse
import com.example.orange_ji.utils.DataState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class NewsDataSource @Inject constructor(
    private val newsRetrofit: NewsService,
) {

    fun getNews(): Flow<DataState<TodoResponse>> = flow {
        emit(DataState.Loading)
        try {
            val data = newsRetrofit.getNews()
            emit(DataState.Success(data))
        } catch (e: Exception) {
            emit(DataState.Error(e))
        }
    }

}