package com.example.memestreamapp

import android.app.Application
import androidx.room.Room

class MyApp : Application() {

    companion object {
        lateinit var database: MemeDatabase
    }

    override fun onCreate() {
        super.onCreate()
        database = Room.databaseBuilder(
            applicationContext,
            MemeDatabase::class.java,
            "meme_db"
        ).build()
    }
}
