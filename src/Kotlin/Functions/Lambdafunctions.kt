package Kotlin.Functions

import kotlin.math.abs

fun main(){

    println("Before")
    teach {
        println("Teaching")
    }
    println("teaching end")

}

inline fun teach(crossinline abc :() -> Unit){
    abc()
}