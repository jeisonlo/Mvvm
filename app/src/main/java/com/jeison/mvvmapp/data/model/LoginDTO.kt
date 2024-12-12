package com.jeison.mvvmapp.data.model
import com.google.gson.annotations.SerializedName
class LoginDTO (
    @SerializedName("username") val unsername: String,
    @SerializedName("password") val password: String
)