package com.jeison.mvvmapp.domain

import com.jeison.mvvmapp.data.model.QuoteModel
import com.jeison.mvvmapp.data.repositories.QuoteRepository

class GetQuotesUseCase {
    private val quoteRepository = QuoteRepository()

    suspend operator fun invoke():List<QuoteModel>? = quoteRepository.getAllQuotes()

}
