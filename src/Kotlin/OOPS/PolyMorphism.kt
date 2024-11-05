package Kotlin.OOPS


fun main(){

    val dog : Animal = Dog()
    val cat : Animal = Cat()
    val rabbit : Animal = Rabbit()

    val arr : Array<Animal> = arrayOf(dog, cat, rabbit, Animal())

    for(animal in arr){
        animal.canRun()
    }
}




open class Animal() {

    open fun canRun(){
        println("Animal Can Run.....")
    }
}


class Dog : Animal(){
    override fun canRun() {
        println("Dog is running.....")
    }
}

class Cat : Animal(){
    override fun canRun() {
        println("Cat is running.....")

    }
}

class Rabbit : Animal(){
    override fun canRun() {
        println("Rabbit is running.....")
    }
}