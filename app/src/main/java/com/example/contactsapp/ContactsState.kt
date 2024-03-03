package com.example.contactsapp

import com.example.contactsapp.Data.Contacts

sealed class ContactEvent{
    object SaveContact: ContactEvent()
    object ShowDialog: ContactEvent()
    object HideDialog : ContactEvent()
    data class SetFirstName (val firstName : String) : ContactEvent()
    data class SetLastName(val secondName :String) : ContactEvent()
    data class SetPhoneNumber(val phoneNo : String) : ContactEvent()
    data class SortContacts(val sortType : SortType) : ContactEvent()
    data class DeleteContacts(val contacts: Contacts) : ContactEvent()
}
