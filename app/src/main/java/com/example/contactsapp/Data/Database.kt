package com.example.contactsapp.Data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.contactsapp.Dao.ContactsDao

@Database(
    entities = [Contacts::class],
    version = 1)
abstract class Database :RoomDatabase() {
    abstract val dao : ContactsDao
}