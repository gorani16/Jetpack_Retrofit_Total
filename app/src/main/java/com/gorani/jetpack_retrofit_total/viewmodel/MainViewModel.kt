package com.gorani.jetpack_retrofit_total.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gorani.jetpack_retrofit_total.api.MyApi
import com.gorani.jetpack_retrofit_total.api.RetrofitInstance
import com.gorani.jetpack_retrofit_total.model.Plant
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val retrofitInstance: MyApi = RetrofitInstance.getInstance().create(MyApi::class.java)

    private val _plant = MutableLiveData<List<Plant>>()
    val plant: LiveData<List<Plant>> = _plant

    fun getAllData() = viewModelScope.launch {
        val plantData = retrofitInstance.getAllPlants()
        Log.d("plantData", plantData.toString())
        _plant.value = plantData
    }



}