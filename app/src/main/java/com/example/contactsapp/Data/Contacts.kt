package com.example.contactsapp.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contacts (
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val firstName : String,
    val secondName : String,
    val number : String
)
