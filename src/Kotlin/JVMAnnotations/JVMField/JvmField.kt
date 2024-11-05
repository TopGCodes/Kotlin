package Kotlin.JVMAnnotations.JVMField

import java.util.*

data class Session @JvmOverloads constructor( @JvmField val name : String, @JvmField val date : Date = Date())

fun main(){
    val kotlinSession = Session("kotlinsession")
    kotlinSession.name
}