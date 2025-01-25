package com.example.orange_ji.di

import com.example.orange_ji.data.datasource.NewsDataSource
import com.example.orange_ji.data.repository.NewsRepository
import com.example.orange_ji.domain.repository.INewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideNewsRepository(
        dataSource: NewsDataSource
    ): INewsRepository {
        return NewsRepository(dataSource)
    }

}