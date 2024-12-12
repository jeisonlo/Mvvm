package com.jeison.mvvmapp.data.network

import com.jeison.mvvmapp.data.model.DataResponse
import com.jeison.mvvmapp.data.model.LoginDTO
import com.jeison.mvvmapp.data.model.UserModel
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface LoginApiClient {

    @POST("sign_in")

    suspend fun login (
        @Body loginDTO: LoginDTO

    ): Response<DataResponse<UserModel>>

}