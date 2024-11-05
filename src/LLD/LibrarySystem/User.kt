package LLD.LibrarySystem

import java.util.UUID

data class User(
    val name : String,
    val unqID : String = UUID.randomUUID().toString(),
    val lentedBooks : List<Book> = listOf()
    ) : LendandreturnProcess {
    override fun lendBook() {
        TODO("Not yet implemented")
    }

    override fun returnBook(): Book {
        TODO("Not yet implemented")
    }

}


interface LendandreturnProcess{
    fun lendBook()
    fun returnBook()  : Book
}
