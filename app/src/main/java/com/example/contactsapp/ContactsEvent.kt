package com.example.contactsapp

import com.example.contactsapp.Data.Contacts

data class ContactsState (
    val contacts: List<Contacts> = emptyList(),
    val firstName : String = "",
    val lastName : String = "",
    val phoneNumber : String = "",
    val isAddingContact : Boolean = false,
    val sortType: SortType = SortType.FIRST_NAME,
    val toast : Boolean = false
)