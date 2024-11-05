package Kotlin.Functions


fun main() {


    val p1 = Person("A")
    val p2 = Person("B")

    println(p1 == p2)


}









data class Person(val name: String)
