package com.flexphd.foodprophet.domain.usecases

import com.flexphd.foodprophet.domain.repository.HomeRepository


class GetStatus(
    private val repository: HomeRepository,
) {
    suspend operator fun invoke(id: Int): String? {
        return ""//repository.getAccountById(id)
    }
}