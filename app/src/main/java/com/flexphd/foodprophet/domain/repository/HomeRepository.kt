package com.flexphd.foodprophet.domain.repository

import dagger.Provides
import kotlinx.coroutines.flow.Flow

interface HomeRepository {

    fun getStatus(): Flow<List<String>>
}