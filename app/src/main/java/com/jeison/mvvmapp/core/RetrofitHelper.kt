package com.jeison.mvvmapp.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    private const val BASE_URL = "https://drawsomething-59328-default-rtdb.europe-west1.firebasedatabase.app/"
    private const val BASE_URL_TWO = "https://autonomia.educarenemociones.com/api/"
    fun getRetrofit():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    fun getRetrofitTwo():Retrofit{
        return Retrofit.Builder()
            .baseUrl(BASE_URL_TWO)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }

}
























