package com.example.orange_ji.di

import com.example.orange_ji.domain.repository.INewsRepository
import com.example.orange_ji.domain.usecase.NewsInteractor
import com.example.orange_ji.domain.usecase.NewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Singleton
    @Provides
    fun provideMovieUseCase(repository: INewsRepository): NewsUseCase {
        return NewsInteractor(repository)
    }

}