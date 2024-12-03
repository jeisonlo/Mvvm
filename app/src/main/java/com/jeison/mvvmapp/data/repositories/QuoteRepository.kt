package com.jeison.mvvmapp.data.repositories

import com.jeison.mvvmapp.data.model.QuoteModel
import com.jeison.mvvmapp.data.model.QuoteProvider
import com.jeison.mvvmapp.data.network.QuoteService

class QuoteRepository {
    private val quoteService = QuoteService()

    suspend fun getAllQuotes():List<QuoteModel>{

        val response = quoteService.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}
