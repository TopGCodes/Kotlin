package DesignPatterns

data class ast(val nam : String)

 abstract class Animal(val name : String) {

    val type : ast = ast("name")

    abstract fun canWalk()

    fun canCrawl() = true
}

interface Animalinterface {
    
    val type : ast
        get() = ast("name")

    fun canWalk() = true
}