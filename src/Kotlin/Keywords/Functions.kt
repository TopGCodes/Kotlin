package Kotlin.Keywords

import ScopeFunctions.add
import kotlin.math.abs
import kotlin.math.min

fun main(){

//    guide()



    val two = 2
    val ans = 3 MultiplY 2
    print(ans)


   firstloop@ for(i in 1..100){
       for(j in 2..100){
           if(j == i){
               break@firstloop
           }
       }

    }
}



infix fun Int.MultiplY(num : Int): Int {
   return  this * num
}


open class User(){
    open val gender : String ?= null
   open fun isLoggedin() : Boolean{
        return true
    }
}

class smallUSer(val name : String) : User(){

    override val gender: String
        get() = super.gender!!

    override fun isLoggedin(): Boolean {
        return super.isLoggedin()
    }
}


fun returnAnyFunction() : ( (Int, Int) -> Int ){
    return ::minuslayo
}


fun minuslayo(a : Int, b : Int) : Int{
    return a + b
}

/*
 * Inline Keyword is used
 */


fun dotasK(){
    println("task start")
    secondtask{
        println("task second")
        return@secondtask
    }
    println("task end")

}

inline fun secondtask(crossinline abc: () -> Unit){
    abc()
}

 inline fun <reified  T> add(value : T){

}
fun guide(){
    println("start Guide")
    teach {
        println("start teach")
        return@teach
    }
    println("end Guide")
}

inline fun teach( crossinline abc: () -> Unit){
abc()
}


