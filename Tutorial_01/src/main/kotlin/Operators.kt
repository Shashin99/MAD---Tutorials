//operators

val a = 5;
val b = 3;

//Arithmetic Operation

val sum = a+b; // summation
val sub = a-b; //subtraction
val mul = a*b; //multiplication
val div = a/b.toFloat() //division

//Comparison Operators
val val1 = a>b
val val2 = a==b
val val3 = a!=b

//Logical Operators
val t = true
val f = false

val val4 = t&&f //AND operator -- both true answer is true
val val5 = t||f //OR operator -- only one is true answer is true
val val6 = !t //NOT operator -- not false answer is true


fun main(){

    println("")
    println("Arithmetic Operation")
    println("Sum = $sum")
    println("Sub = $sub")
    println("mul = $mul")
    println("div = $div")

    println("")
    println("Comparison Operators")
    println("val1 = $val1")
    println("val2 = $val2")
    println("val3 = $val3")

    println("")
    println("Logical Operators")
    println("val4 = $val4 --> using AND operator")
    println("val5 = $val5 --> using OR operator")
    println("val6 = $val6 --> using NOT operator")

}