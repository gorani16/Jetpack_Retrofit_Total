package com.gorani.jetpack_retrofit_total.model

data class Plant(
    val plantId: String,
    val name: String,
    val description: String,
    val growZonNumber: Int,
    val wateringInterval: Int,
    val imageUrl: String
)
