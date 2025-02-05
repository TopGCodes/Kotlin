package LLD.LibrarySystem

import java.util.UUID

data class Book(
    val id : String = UUID.randomUUID().toString(),
    val title : String,
    val author : String,
    val isAvailableForRent : Boolean
)


