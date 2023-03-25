// Conditions and Loops

fun main(){

    println("")
    println(" ------------------ Conditions & Loops ------------------ ")
    // If expression
    var age = 5
    if(age > 18){
        println("The Person is an Adult")
    }
    else{
        println("The Person is a child")
    }

    //when expression
    var x = 5
    when(x){
        0,1 -> println(" x == 0 OR x == 1")
        else -> println("otherwise")
    }

    //For Loop -  normal
    for(i in 1 .. 10 ){
        print("$i ") //  1 2 3 4 5 6 7 8 9 10

    }

    //For Loop -  step
    println(" ")
    for(i in 0..20 step 5){
        print("$i ") // 0 5 10 15 20

    }

    //For Loop -  until
    println(" ")
    for(i in 1 until 10){
        print("$i ") // 1 2 3 4 5 6 7 8 9

    }

    //For Loop -  break type 01
    println(" ")
    for(i in 1..10){
        print("$i ")//1 2 3 4 5
        if(i==5) {
            break
        }
    }

    //For Loop -  break type 01
    println(" ")
    for(i in 1..10){
        if(i==5){
            break
        }
        print("$i ") // 1 2 3 4
    }

    //For Loop -  continue
    println(" ")
    for (i in 1 .. 10){
        if (i==5){
            continue
        }
        print("$i ") //1 2 3 4 6 7 8 9 10
    }

    // While Loop
    println(" ")
    var i = 0
    while(i < 5) {
        println(i)
        i++
    }
//    0
//    1
//    2
//    3
//    4

}
