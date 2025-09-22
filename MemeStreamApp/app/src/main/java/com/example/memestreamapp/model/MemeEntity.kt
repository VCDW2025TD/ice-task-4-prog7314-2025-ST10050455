package com.example.memestreamapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "memes")
data class MemeEntity(
    @PrimaryKey(autoGenerate = true)
    val localId: Int = 0,   // for Room tracking
    val id: String?,        // API id (nullable if not synced)
    val caption: String,
    val imageUrl: String,
    val location: String?,
    val timestamp: Long,
    val userId: String,
    val isSynced: Boolean = false // false = waiting to sync
)
