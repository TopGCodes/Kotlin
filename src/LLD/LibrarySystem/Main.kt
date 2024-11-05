package LLD.LibrarySystem

// Sealed Interface
sealed class userRequest

data class LoginRequest(val name : String, val password : String) : userRequest()
data object LogoutRequest : userRequest()



sealed class ApiResponse{
    data class UserFound(val data : String)  : ApiResponse()
    data class UserNotFound(val messsage : String) : ApiResponse()
    data object Error : ApiResponse()
}

fun handleRequest(userRequest: userRequest){
    when(userRequest){
        is LogoutRequest ->{
            print("Logout Succeed")
        }
        is LoginRequest ->{
            val isValid = isvalid(userRequest.name, userRequest.password)
            if(isValid){
                val userdata = ApiResponse.UserFound("userdetials")
                println("Here are the user details : ${userdata.data}")
                print("Login Success")
            }

        }
    }
}

fun isvalid(name : String, password: String) = if(name.isBlank().not()) true else false

fun main(){
    println("Login or Lgout")
    val loggingType = readLine()
    when(loggingType){
        "login" ->{
            handleRequest(LoginRequest("name", "nuull"))
        }
        "logout" ->{
             handleRequest(LogoutRequest)
        }
    }




}