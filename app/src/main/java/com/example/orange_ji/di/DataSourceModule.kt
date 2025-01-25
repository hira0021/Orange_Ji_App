package com.example.orange_ji.di

import com.example.orange_ji.data.datasource.NewsDataSource
import com.example.orange_ji.data.remote.NewsService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Singleton
    @Provides
    fun provideNewsDataSource(
        retrofit: NewsService,
    ): NewsDataSource {
        return NewsDataSource(retrofit)
    }

}