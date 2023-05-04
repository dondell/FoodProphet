package com.flexphd.foodprophet.di

import com.flexphd.foodprophet.domain.repository.HomeRepository
import com.flexphd.foodprophet.domain.usecases.GetStatus
import com.flexphd.foodprophet.domain.usecases.HomeUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideEntryUseCases(
        repository: HomeRepository,
    ): HomeUseCases {
        return HomeUseCases(
            getStatus = GetStatus(repository)
        )
    }
}