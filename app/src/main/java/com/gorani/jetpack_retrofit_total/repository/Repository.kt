package com.gorani.jetpack_retrofit_total.repository

import com.gorani.jetpack_retrofit_total.api.MyApi
import com.gorani.jetpack_retrofit_total.api.RetrofitInstance

/**
 * 참고) 종속 항목 수동 삽입
 * - Activity / Fragment
 * -> ViewModel (LiveData1, 2, 3, ..)
 * -> Repository
 * -----------------------------------------------
 * -> Remote Data Source (Retrofit) -> WebService
 * -----------------------------------------------
 * or
 * -----------------------------------------------
 * -> Model (Room) -> SQLite
 * -----------------------------------------------
 *
 * https://developer.android.com/training/dependency-injection/manual?hl=ko
 *
 */

class Repository {

    private val client = RetrofitInstance.getInstance().create(MyApi::class.java)

    suspend fun getAllData() = client.getAllPlants()

}