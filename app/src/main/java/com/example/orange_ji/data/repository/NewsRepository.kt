package com.example.orange_ji.data.repository

import com.example.orange_ji.data.datasource.NewsDataSource
import com.example.orange_ji.domain.model.TodoResponse
import com.example.orange_ji.domain.repository.INewsRepository
import com.example.orange_ji.utils.DataState
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class NewsRepository @Inject constructor(
    val newsDataSource: NewsDataSource
) : INewsRepository {

    override suspend fun getNews(): Flow<DataState<TodoResponse>> {
        return newsDataSource.getNews()
    }

}