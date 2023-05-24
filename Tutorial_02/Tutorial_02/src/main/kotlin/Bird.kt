import java.awt.Color

// Classes and Objects -------------------------------------------------------------------------------------------------

//fun main(){
//    val b1 = Bird() // create b1 object of the bird class
//
//    // Access the properties and add some values to it
//    b1.type = "Parrot"
//    b1.color = "Green"
//
//    println(b1.type) // display Parrot
//    println(b1.color) // display Green
//}
//
//class Bird {
//    var type = " "
//    var color = " "
//
//}

// Constructors --------------------------------------------------------------------------------------------------------

//class Bird (var type:String, var color: String)
//
//fun main(){
//    val b1 = Bird ("Parrot", "Green")
//
//    println(b1.type)
//    println(b1.color)
//}

// Inheritance ---------------------------------------------------------------------------------------------------------

////super class
//    open class Bird {
//        var color = "Green"
//    }
//
////subclass
//class Parrot:Bird(){
//    fun myFunction() {
//        println(color) // color is defined in the super class
//    }
//}
//
////create an object of the parrot class and call myFunction
//fun main(){
//    var myObj = Parrot()
//    myObj.myFunction()
//}

// Interfaces ----------------------------------------------------------------------------------------------------------
//interface Vehicle{
//    fun start()
//    fun stop()
//}
//
//class Car : Vehicle{
//    override fun start() {
//        println("Car Started")
//    }
//
//    override fun stop() {
//        println("Car Stopped")
//    }
//}
//
//fun main(){
//    val obj = Car()
//    obj.start()
//    obj.stop()
//}

// Properties ----------------------------------------------------------------------------------------------------------

//class Abc(
//    val name: String,
//    val isPassed: Boolean
//)
//
//fun main(args:Array<String>){
//    val abc = Abc("Bob", true)
//    println(abc.name)
//    println(abc.isPassed)
//
//    /* when we are using java above syntax using as follows:
//        Abc abc = new abc("Bob", true)
//        System.out.println(person.getName());
//        System.out.println(person.isMarried());
//     */
//}

// Sealed Classes ------------------------------------------------------------------------------------------------------
// see sealed class - MyClass.kt

//Enum Classes ---------------------------------------------------------------------------------------------------------
// see enum class - Day