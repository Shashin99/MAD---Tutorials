import kotlin.random.Random.Default.nextInt

// Write a Kotlin function to calculate the circumference of a circle for a given radius value

fun main(){

    var radius = 9.5
    circumferenceCircle(radius)
}

fun circumferenceCircle(radius:Double){

    val circumference = (2 * 22 * radius)/7
    println("")
    println("Circumference of a circle is $circumference")

}