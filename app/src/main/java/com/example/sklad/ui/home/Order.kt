package com.example.sklad.ui.home

data class Order(
    val id: Int,
    val address: String,
    val name: String,
    val price: Double,
    val created_time: String,
    val owner: Int
)
