fun main(){
// Create an empty mutable list to hold the multiples of 3
    val multiplesOf3 = mutableListOf<Int>()

// Use a for loop to calculate the multiples of 3 and add them to the list
    for (i in 0..100 step 3) {
        multiplesOf3.add(i)
    }

// Print the list to verify the output
    multiplesOf3.remove(0)
    println(" Multiplications of 3 from 0 to 100")
    println(multiplesOf3)
    println("Even Numbers in the Array")
    for (i in multiplesOf3) {

        if(i%2 !== 0) {
            continue
        }
        print("$i ")
    }

}