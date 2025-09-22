package com.example.memestreamapp.network
import com.example.memestreamapp.model.Meme
import com.example.memestreamapp.model.MemePost
import retrofit2.http.*

interface ApiService {
    @GET("memes")
    suspend fun getMemes(@Query("userId") userId: String? = null): List<Meme>

    @POST("memes")
    suspend fun postMeme(@Body meme: MemePost): Meme
}