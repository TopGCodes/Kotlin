package Kotlin.DataClasses


fun main(){


    val list = listOf(
      User("A", 1),
     User("A", 2)
    )


    val ans = list.associateBy { { it.num }() }
    ans.forEach { map ->
        print(map.key)
    }
//    println(ans)



//    val person1 = Person("Android")
//    val person2 = Person("Ios")
//    val person3 = person1
//    val person4isCopyofPerson1 = person1.copy("AI")
//
//
//    // It Checks Both Objects HashCode(), return 'true' if both are equal else 'false'
//    val isEqual = person1.equals(person2.copy("Android"))
//
////    println("person1 hashcode - ${person1.hashCode()}")
////    println("person2 hashcode - ${person2.hashCode()}")
////    println("person3 hashcode - ${person3.hashCode()}")
////    println("Object Comparison - $isEqual")
////    println("person4isCopyofPerson1- ${person4isCopyofPerson1}")
//
//    //printting Properties
//    println(person1.gender)
//    person1.gender = "male"
//    println(person1.gender)
//    println(person1.age)
}

data class Person(val name : String){

    val age : Int = 0
    var gender : String = "Unknown"

}

data class User(val name : String, val num : Int)




