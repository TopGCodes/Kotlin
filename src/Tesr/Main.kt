package Tesr

interface Filtercriteria{
    fun filter(list : List<String>) : List<String>
}
class FilterBYlanaguage(private val lang : String) : Filtercriteria{
    override fun filter(list : List<String>): List<String> {
        TODO("Not yet implemented")
    }
}
class FilterByContinent(val conti : String) : Filtercriteria{
    override fun filter(list : List<String>): List<String> {
        TODO("Not yet implemented")
    }
}


fun main(){

    val viewModel  = ViewModel()
    val selectedFilter = "NULL"
    when(selectedFilter){
        "Cont" -> {
            viewModel.filterINViewModeL(FilterByContinent(selectedFilter))
        }
        "Lang" ->{
            viewModel.filterINViewModeL(FilterBYlanaguage(selectedFilter))
        }
    }
}

interface FilterCriteriaFactory{
    fun createFilterCreteria()
}



class ViewModel(){
    fun filterINViewModeL(filtercriteria: Filtercriteria){
        filtercriteria.filter(listOf())
    }
}
class Repository{
    fun filterInRepo(filtercriteria: Filtercriteria){
        filtercriteria.filter(listOf())
    }
}


