////Kotlin program without generic class
//
//fun main(){
//
//    class Company (text: String) {
//        var x = text
//        init{
//            println(x)
//        }
//    }
//    fun main(args: Array<String>){
//        var name: Company = Company("GeeksforGeeks")
//        var rank: Company = Company(12)// compile time error
//    }
//
//}

//-------------------------------------------------------------------------------------------------------------------

////Kotlin program with generic class

//fun main(args: Array<String>){
//    var name: Company<String> = Company<String>("GeeksforGeeks")
//    var rank: Company<Int> = Company<Int>(12345)
//}
//
//class Company<T> (text : T){
//    var x = text
//    init{
//        println(x)
//    }
//}

//-------------------------------------------------------------------------------------------------------------------

// --------------- Example 01  display (1,2,3,4,5)

//fun copy(from: Array<out Any>, to: Array<Any>) {
//    assert(from.size == to.size)
//    // copying (from) array to (to) array
//    for (i in from.indices)
//        to[i] = from[i]
//    // printing elements of array in which copied
//    for (i in to.indices) {
//        println(to[i])
//    }
//}
//fun main(args :Array<String>) {
//    val ints: Array<Int> = arrayOf(1, 2, 3,4,5)
//    val any :Array<Any> = Array<Any>(5) { "" }
//    copy(ints, any)
//
//}

// --------------- Example 02  display (

// star projection in array
fun printArray(array: Array<*>) {
    array.forEach { print(it) }
}
fun main(args :Array<String>) {
    val name  = arrayOf("My Name"," is"," Shashin")
    printArray(name)
}