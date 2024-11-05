package DesignPatterns.FactoryDesignPattern

import Kotlin.Keywords.minuslayo
import Tesr.ViewModel
import java.util.logging.Filter

// we need to objects
// factory will provide those objects
// we need provider class to provide those objects from the factory

/*
  Problem :
   filter functionality is same but we created differetn emthods for different filter like one method for filterByCOntinent, filterbyDriveside
   we need to "STRATEGY PATTERN HERE"
   IT MEANS  no  matter what kind of filter it should filter accordingly
 */

//Solution :
interface FilterCriteria{
    fun filter(filter: String) : List<String>
}
class FilterbyContinent() : FilterCriteria{
    override fun filter(filter: String): List<String> {
        // returns list after filtering by continent
        println("Here the list of countries filtered by  COntinent")
        return listOf()
    }
}
class FilterByDriveSide() : FilterCriteria{
    override fun filter(filter: String): List<String> {
        println("Here the list of countries filtered by drive side")
        return listOf()
    }
}
class viewMOdel() {
    fun filter(filterCriteria: FilterCriteria, filter: String){
        filterCriteria.filter(filter)
    }
}

fun main(){
    val vm = viewMOdel()
    println("Enter the Filter you want")
    val input = readLine()
    val filterCriteriaFactory = FilterCriteriaProviderFromFactory.getCorrespondingFilter(input!!)
    val filterType = filterCriteriaFactory.createFilterCriteria(input)
    vm.filter(filterType, input)
//    when(input){
//        // here we are violating OCP principle
//        "continent" ->{
//            vm.filter(FilterbyContinent(), input)
//        }
//        "drive" ->{
//            vm.filter(FilterByDriveSide(), input)
//        }
//    }
}

interface FilterCriteriaFactory{
    fun createFilterCriteria(filter : String)  : FilterCriteria
}
class ContinentFilter() : FilterCriteriaFactory{
    override fun createFilterCriteria(filter: String) : FilterCriteria {
        return FilterbyContinent()
    }
}

class DriveSideFilter() : FilterCriteriaFactory{
    override fun createFilterCriteria(filter: String): FilterCriteria {
        return FilterByDriveSide()
    }
}


object FilterCriteriaProviderFromFactory{

    private val map = mapOf(
        "continent" to ContinentFilter(),
        "drive" to DriveSideFilter()
    )

    fun getCorrespondingFilter(filter : String) : FilterCriteriaFactory{
       return map[filter]!!
    }
}


