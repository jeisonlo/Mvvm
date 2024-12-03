package com.jeison.mvvmapp.data.network

import com.jeison.mvvmapp.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {


    @GET("/.json")
    suspend fun getAllQuotes():Response<List<QuoteModel>>

}
