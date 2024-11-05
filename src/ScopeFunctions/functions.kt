package ScopeFunctions

fun main(){


    val fruitBasket  : Basket  = Basket("fruits", false)

    //----> Let
    // passes reference as 'it' and return "result"
     val let_basket  =  fruitBasket.let {
         it.name = "Veggdies"
         it.add()
    }
    println(fruitBasket.name)
    println(let_basket)


    // ----> also
    // passes reference as 'it' and return "object"
    val also_basket  =  fruitBasket.also {
        it.name = "Veggdies"
        it.add()
    }
    println(fruitBasket.name)
    println(let_basket)



    // ----> Apply
    // passes reference as "this" and returns "object" only
    val apply_for_basket = fruitBasket.apply {
        this.add()
    }


    //----> With
    // passes reference as "this"  and returns "result" only
    val with_basket = with(fruitBasket){
        this.add()
    }

    //----> run
    // passes reference as "this"  and returns "result" only
    val run_on_basket = fruitBasket.run {
        this.add()
    }


val add = returnAddfunction()
    println(add(2, 3))


    println(5 addNums  66)


    val b1 = Basket("fruit",true )
    val b2 = b1.copy("veg", false)
    val list = listOf(b1, b2)

    val (f, se) = list.partition {  it.name.contains("f")}
    println(f)
    println(se)


}







fun add(a : Int, b : Int) : Int{
    return a + b
}

fun returnAddfunction() :( (Int, Int) -> Int  ){
    return ::add
}

infix fun Int.addNums(a : Int) : Int {
    return this + a
}







data class Basket(var name : String, val isVEg : Boolean){



    fun add() = true
}