package com.example.memestreamapp.network

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object RetrofitClient {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://memestream-ko7d.onrender.com") // replace with your Render API URL
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val api: ApiService = retrofit.create(ApiService::class.java)
}