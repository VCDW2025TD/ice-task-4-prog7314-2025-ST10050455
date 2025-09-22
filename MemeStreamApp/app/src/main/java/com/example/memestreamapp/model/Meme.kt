package com.example.memestreamapp.model

data class Meme(
    val _id: String,
    val userId: String,
    val imageUrl: String,
    val caption: String?,
    val lat: Double?,
    val lng: Double?,
    val timestamp: String
)



