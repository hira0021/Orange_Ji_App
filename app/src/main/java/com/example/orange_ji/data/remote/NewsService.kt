package com.example.orange_ji.data.remote

import com.example.orange_ji.domain.model.TodoResponse
import retrofit2.http.GET

interface NewsService {
    @GET("todos")
    suspend fun getNews(
//        @Query("page") page: Int,
//        @Query("api_key") apiKey: String
    ): TodoResponse
}