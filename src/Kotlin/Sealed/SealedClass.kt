package Kotlin.Sealed


sealed class Parent{


    abstract val name : String
    abstract val gender : String
    abstract val age : Int





    data class Mother(
        override var name: String,
        override val gender: String,
        override val age: Int,
    ): Parent() {

        fun changeName() : String  {
           return name.plus("Ryan")
        }

    }


    data class Father(
        override val name: String,
        override val gender: String,
        override val age: Int
    ) : Parent() {

    }


}


