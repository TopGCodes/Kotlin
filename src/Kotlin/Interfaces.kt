import jdk.incubator.vector.VectorOperators.Ternary

fun main() {

    val registenScreen = RegistenScreen()
    val manualRegistration = registenScreen.registerUserManually()
    val defaultRegistration = registenScreen.registenUser_byDefault()

//    println(manualRegistration)
//    println(defaultRegistration)
//    println(registenScreen.registerUsername)
//    println(registenScreen.defaultUserName)

    println(registenScreen.agreementStatus)


}


interface Registration : TermsAndConditions {

    val registerUsername: String
        get() = "kdjf"

    val defaultUserName: String
        get() = "Default user"

    fun registenUser_byDefault() = println("in interface - User resgitred Default")

    fun registerUserManually(): String
//
//    override val agreementStatus: String
//        get() = "While Registering Agreement Status - False"

}


interface TermsAndConditions {
    val agreedToConditions: Boolean get() = true

    val agreementStatus: String get() = "Agreed"
}


// IF we Override the variable in Class then only we get the implementation which is declared in this class , else we get the default implmentation in in the interface
/*
  here 'agreementStatus' is not overriden in 'Registration' interface and also in 'RegistenScreen' Class so get the default of 'agreementStatus' which we gave in
     'TermsAndConditions' interface
 */
class RegistenScreen() : Registration {

    override val registerUsername: String
        get() = "Androider"

    override val defaultUserName: String
        get() = super.defaultUserName

    override fun registerUserManually(): String {
        println("Registered User Manually")
        return "Registered User Manually"
    }

    override val agreedToConditions: Boolean
        get() = super.agreedToConditions

}


