package Kotlin.OOPS

/*
ocuses on hiding the complex implementation details and exposing only the necessary parts of an object.
 */

class Coffeemachine()  {

    fun giveCoffee(){
        heatCoffee()
        grindBeans()
        println("Here is the Coffee")
    }

    private fun heatCoffee(){
        println("Heating Coffee")
    }

    private fun grindBeans(){
        println("Grinding Beans")
    }
}

fun main(){
    val machine  = Coffeemachine()
    machine.giveCoffee()
}

abstract class check{
    abstract fun notabstractCompulsary()
    abstract fun abstractCompulsary()
}

interface check2{
     fun notabstractCompulsary2()
     fun abstractCompulsary2()
}

class cc : check(), check2 {
    override fun notabstractCompulsary2() {
        TODO("Not yet implemented")
    }

    override fun abstractCompulsary2() {
        TODO("Not yet implemented")
    }
    override fun abstractCompulsary() {
        TODO("Not yet implemented")
    }

    override fun notabstractCompulsary() {
        TODO("Not yet implemented")
    }



}



