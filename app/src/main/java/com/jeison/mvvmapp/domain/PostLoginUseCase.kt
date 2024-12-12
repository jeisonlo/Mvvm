package com.jeison.mvvmapp.domain

import com.jeison.mvvmapp.data.model.DataResponse
import com.jeison.mvvmapp.data.model.LoginDTO
import com.jeison.mvvmapp.data.model.UserModel
import com.jeison.mvvmapp.data.repositories.LoginRepository

class PostLoginUseCase {

    private val loginRepository = LoginRepository()
    suspend operator fun invoke(loginDTO: LoginDTO): DataResponse<UserModel> {
        return loginRepository.login(loginDTO)
    }
}