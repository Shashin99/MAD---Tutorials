fun main(){
    println()
    printSingleLine("Single line comment shows here")
    printMultiLine("Multi line comment shows here")
}

//This is a Single Line Comment
fun printSingleLine(a:String){
    println("// $a")
}

fun printMultiLine(a:String){
    println("/* $a */")
}