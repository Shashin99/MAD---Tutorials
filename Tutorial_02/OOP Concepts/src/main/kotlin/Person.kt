//Constructors----------------------------------------------------------------------------------------------------------
//Primary Constructor

//fun main() {
//
//    val Person1 = Person("Joe",25)
//        println("First Name = ${Person1.firstName}")
//        println("Age = ${Person1.age}")
//}
//
//class Person(val firstName: String, var age: Int){
//
//}

//Primary Constructor and Initializer Blocks - Method 01

//fun main(){
//    val Person1 = Person("Joe", 25)
//}
//
//class Person(fName:String, personAge:Int){
//    val firstName: String
//    var age:Int
//
//    //initializer block
//    init {
//        firstName = fName.uppercase()
//        age = personAge
//
//        println("First Name: $firstName")
//        println("Age: $age")
//    }
//}

//Primary Constructor and Initializer Blocks - Method 02

//fun main() {
//    val person1 = Person("joe", 25)
//}
//
//class Person(fName: String, personAge: Int) {
//    val firstName = fName.uppercase()
//    var age = personAge
//
//
//    // initializer block
//    init {
//        println("First Name = $firstName")
//        println("Age = $age")
//    }
//}

//Default Value in Primary Constructor

//fun main(){
//
//    println("person1 is instantiated -----------------------------------------------------------------------------------")
//    val Person1 = Person("joe", 25)
//
//    println("person2 is instantiated -----------------------------------------------------------------------------------")
//    val Person2 = Person("jack")
//
//    println("person3 is instantiated -----------------------------------------------------------------------------------")
//    val Person3 = Person()
//}
//
//class Person(_firstName:String = "UNKNOWN",_age:Int = 0 ) {
//    val firstName = _firstName.uppercase()
//    var age = _age
//
//    //initializer block
//    init {
//        println("First Name = $firstName")
//        println("Age = $age")
//    }
//}

//Secondary Constructor
