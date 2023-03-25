fun main(a: Array<String>) {

    println("Is 1 is a prime number? " +isPrimeNumber(1))
    println("Is 15 is a prime number? " +isPrimeNumber(15))
}

fun isPrimeNumber(number: Int): Boolean {
    for(i in 2..number / 2){
        if (number % i == 0) {
            return false;
        }
    }
    return true;
}