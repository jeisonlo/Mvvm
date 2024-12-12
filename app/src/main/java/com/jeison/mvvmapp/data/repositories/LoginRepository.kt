package com.jeison.mvvmapp.data.repositories
import com.jeison.mvvmapp.data.model.DataResponse
import com.jeison.mvvmapp.data.model.LoginDTO
import com.jeison.mvvmapp.data.model.UserModel
import com.jeison.mvvmapp.data.model.UserProvider
import com.jeison.mvvmapp.data.network.LoginService
class LoginRepository {

    private val loginService = LoginService()
    suspend fun login(loginDTO: LoginDTO): DataResponse<UserModel> {
        val response = loginService.login(loginDTO)
        if (response.status == "ok") {
            UserProvider.user = response.data

        }
        return response

    }
}