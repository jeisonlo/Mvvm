package com.jeison.mvvmapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.jeison.mvvmapp.model.QuoteModel
import com.jeison.mvvmapp.model.QuoteProvider

class QuoteViewModel : ViewModel() {

     val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote() {
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)

    }
}