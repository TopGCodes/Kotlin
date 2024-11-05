package Kotlin.Sealed

fun main(){

    val Mother = Parent.Mother("Stan", "Male", 10)
    println("Mother Dataclass  - $Mother")
    println("Changed Name - ${Mother.changeName()}")
    print("after Changinh name - $Mother.")


}