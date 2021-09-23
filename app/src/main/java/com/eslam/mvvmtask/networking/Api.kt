package com.eslam.mvvmtask.networking

import retrofit2.http.GET
import com.eslam.mvvmtask.model.UsersResponse
import retrofit2.Response

interface Api {

    @GET("api/users?page=2")
    suspend fun listOfUsers(): Response<UsersResponse>

}