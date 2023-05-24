fun main(){
    val c1 = Car()

    c1.brand = "Honda"
    c1.model = "Civic"
    c1.year = "2023"

    println("---------- Car ---------- ")
    println(c1.brand)
    println(c1.model)
    println(c1.year)
}

class Car {
    var brand=""
    var model=""
    var year=""
}