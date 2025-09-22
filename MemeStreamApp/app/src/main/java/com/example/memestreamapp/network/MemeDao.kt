package com.example.memestreamapp.network

import androidx.room.*
import com.example.memestreamapp.model.MemeEntity

@Dao
interface MemeDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeme(meme: MemeEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMemes(memes: List<MemeEntity>)

    @Query("SELECT * FROM memes ORDER BY timestamp DESC")
    suspend fun getAllMemes(): List<MemeEntity>

    @Query("SELECT * FROM memes WHERE isSynced = 0")
    suspend fun getUnsyncedMemes(): List<MemeEntity>

    @Update
    suspend fun updateMeme(meme: MemeEntity)

    @Delete
    suspend fun deleteMeme(meme: MemeEntity)
}
