package com.gorani.jetpack_retrofit_total.repository

import com.gorani.jetpack_retrofit_total.api.MyApi
import com.gorani.jetpack_retrofit_total.api.RetrofitInstance

class Repository {

    private val client = RetrofitInstance.getInstance().create(MyApi::class.java)

    suspend fun getAllData() = client.getAllPlants()

}