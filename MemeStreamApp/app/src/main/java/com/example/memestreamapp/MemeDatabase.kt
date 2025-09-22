package com.example.memestreamapp

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.memestreamapp.model.MemeEntity
import com.example.memestreamapp.network.MemeDao

@Database(entities = [MemeEntity::class], version = 1, exportSchema = false)
abstract class MemeDatabase : RoomDatabase() {
    abstract fun memeDao(): MemeDao
}
