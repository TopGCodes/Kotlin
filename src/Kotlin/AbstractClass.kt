abstract class Parent(){

   abstract val name : String

   abstract fun walking()

   fun breathing() = println("Parent is Breathing")
}

interface check{
    fun checking() = {   }
    fun check2()
}



class child1 : Parent(),  check{
    override val name: String
        get() = TODO("Not yet implemented")

    override fun walking() {
        println("Child1 is Walking")
    }

    override fun check2() {
        TODO("Not yet implemented")
    }

    override fun checking(): () -> Unit {
        return super.checking()
    }


}

class child2 : Parent(){
    override val name: String
        get() = TODO("Not yet implemented")

    override fun walking() {
        println("Child2 is Walking")
    }


}

fun main(){

    val c1 = child1()
    val c2 = child2()

    val list = listOf(c1, c2)

    list.forEach {
        it.walking()
        it.breathing()
    }


}

