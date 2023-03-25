//Basic Data Types

//• Numbers and their unsigned counterparts
//• Booleans
//• Characters
//• Strings
//• Arrays

// Numbers and their unsigned counterparts

val intValuealue = 1; // Integer
val longValue1 = 100000; // Long
val longValue2 = 1L; // Long
val byteValue:Byte = 1 // Byte
val doubleValue = 1.0 // Double
val floatValue = 1.2384789f // Float

// Booleans
// either TRUE or FALSE can be stored in a boolean data type variable

 val trueValue = true; // True
 val falseValue = false; // False

// Characters
val characterValue = "A"

// Strings
val strValue = "Kotlin"

// Arrays
//As opposed to generating distinct variables for each value, arrays are used to store numerous  values in a single variable.
fun main(){
var clothingBrands = arrayOf("GUCCI", "Chanel", "Adidas", "ZARA", "Puma")

//size of the array
 println("Size of the array is " + clothingBrands.size)  // display 5

 println("******************************************")

 //Access an element in an array
 println(clothingBrands[4]) // display Puma

 println("******************************************")

 //change an array element
 clothingBrands[0] = "Levi's"
 println(clothingBrands[0]) // display Levi's

 println("******************************************")

 //looping through the array
 for (i in clothingBrands){
  println(i)
 }
 println()
 println(" MY IMPLEMENTATION ")
 var vehicleBrands = arrayOf("A", "B", "C", "D" ,"E", "F")

 println("Size of the array is " + vehicleBrands.size)
 println("------------------------------------")

 for (brand in vehicleBrands)
  println(brand)
 println("------------------------------------")

 vehicleBrands[3] = "waiting"
 println(vehicleBrands[3])
 println("------------------------------------")

 for (brand in vehicleBrands)
 println(brand)
 println("------------------------------------")

 vehicleBrands[3] = "D"
 vehicleBrands.reverse();
 println(vehicleBrands.contentToString())

}
