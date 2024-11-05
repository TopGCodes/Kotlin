//Since all the shapes can be drawm, there is a common behaviour....So instead of writing each method for each Shape Class
// we write one common method using interface and override it in all classes
abstract class Shape {
   abstract fun draw()
}


// 1.  these are the Objects that client class need
class Circle() : Shape() {
    override fun draw() {
        println("Circle is Drawn")
    }
}
class Rectangle() : Shape() {
    override fun draw() {
        println("Rectangle is Drawn")
    }
}
class Square() : Shape() {
    override fun draw() {
        println("Square is Drawn")
    }

    // 2. we need to create factory, to provide those above objects
    interface ShapesFactory {
        fun getShape(type: String): Shape
    }

    // 3. we need a Concrete class which can provide above objects to client
   // Our Concrete Class
    class ShapesProviderFromFactory() : ShapesFactory {
        override fun getShape(type: String): Shape {
             return when (type) {
                "Circle" -> {
                    Circle()
                }
                "Square" -> {
                    Square()
                }
                else -> {
                    Rectangle()
                }
            }
        }
    }

    //Client Code
    fun main() {
        //This Function is Our Client,it can be class as well
        val ShapesProvider = ShapesProviderFromFactory()
        //required Shape for Client
        val requiredShape: Shape = ShapesProvider.getShape("Circle")
        requiredShape.draw()

    }
}











