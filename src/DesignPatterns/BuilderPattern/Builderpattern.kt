import java.lang.Thread.Builder
import javax.naming.Context
import javax.sound.midi.MetaMessage

/*
 Builder Pattern is Creational pattern which is used while creating classes whose some paramaters are optional and some
 are Mandatory and when you want immutable objects, but still need a flexible way to create.

 - What happens if we dont use Builder patterns in such Scenarios
    . we need to use "Contructor Overloading" which increases Complexity and hard to understand
    . Readability Issues
    .  Increases Complexity for Client classes
 */


//Builder Pattern Example , lets take an example  of creating  AlertDialog example in android

class AlertDialog private constructor(
    val title : String,
    val message: String,
    val size : Int
){

    // Here Giving Context to Builder is "mandatory"
    // This Builder class will create AlertDialog Object in Simple terms
    class Builder() {

         private var dialogTitle : String = "Dialog" // Optional parameters
         private var dialogMessage : String = "Message"// Optinal Parametes
         private var dialogSize : Int = 10 // optional Parameters

        fun setTitle(title : String)  : Builder{
            this.dialogTitle = title
            return this
        }
        fun setMessage(msg : String)  : Builder{
            this.dialogMessage = msg
            return this
        }
        fun setSize(size : Int) : Builder {
            this.dialogSize = dialogSize
            return this
        }
        fun create() : AlertDialog{
            return AlertDialog(dialogTitle, dialogMessage, dialogSize)
        }
    }
}
fun main(){
    val dialog = AlertDialog.Builder()
        .setTitle("Alert")
        .setMessage("Practice Builder pattern")
        .create()



}