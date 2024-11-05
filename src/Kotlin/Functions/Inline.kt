package Kotlin.Functions





fun main(){

    println("Teaching")
    check {
        println("Checking")
        return@check
    }
    println("end")

}


inline fun check( f : () ->  Unit){
    f()
}



