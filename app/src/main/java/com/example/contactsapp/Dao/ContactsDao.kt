package com.example.contactsapp.Dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Query
import androidx.room.Upsert
import com.example.contactsapp.Data.Contacts
import kotlinx.coroutines.flow.Flow

@Dao
interface ContactsDao {
    @Upsert
    suspend fun insertContacts(contacts: Contacts)

    @Delete
    suspend fun deleteContacts(contacts: Contacts)

    @Query("SELECT * FROM contacts  ORDER BY firstName ")
    fun getContactsOrderedByFirstName() : Flow<List<Contacts>>

    @Query("SELECT * FROM contacts  ORDER BY secondName ")
    fun getContactsOrderedByLastName() : Flow<List<Contacts>>

    @Query("SELECT * FROM contacts  ORDER BY number ")
    fun getContactsOrderedByPhoneNumber() : Flow<List<Contacts>>

}
