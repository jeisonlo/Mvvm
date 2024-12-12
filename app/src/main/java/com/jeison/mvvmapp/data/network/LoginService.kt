package com.jeison.mvvmapp.data.network
import com.jeison.mvvmapp.core.RetrofitHelper
import com.jeison.mvvmapp.data.model.DataResponse
import com.jeison.mvvmapp.data.model.LoginDTO
import com.jeison.mvvmapp.data.model.UserModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.withContext

class LoginService {
    private val retrofitTwo = RetrofitHelper.getRetrofitTwo()
    suspend fun login (loginDTO: LoginDTO): DataResponse<UserModel>{

        return withContext(Dispatchers.IO){
            //llamada al API
            val response = retrofitTwo.create(LoginApiClient::class.java).login(loginDTO)
            response.body() ?:
            DataResponse(UserModel( "",  ""),  "error",  "Error")
        }
    }

}