//Kotlin Collections are in two types as,
//        1.Immutable Collection - This category supports only read-only functionalities
//
//                        List –listOf<T>()
//                        Set – setOf<T>()
//                        Map – mapOf<K,V>()
//
//        2.Mutable Collection – This supports both read and write functionalities (adding,removing, updating)
//
//                        List – mutablelistOf<T>()
//                        Set – mutablesetOf<T>()
//                        Map – mutablemapOf<K,V>()


//List - Immutable List

//fun main(){
//    val family = listOf("father", "mother", "sister")
//
//    println(family[0]) // father
//
//    for (i in family){
//        print("$i ")  // father mother sister
//    }
//    println("")
//    println(family.size) // 3
//}

//List - Mutable List

//fun main(){
//    val family = mutableListOf("father", "mother")
//    family.add("brother")
//
//    family.remove("father")
//
//    println(family[0]) //mother
//
//    for(i in family){
//        print("$i ") // mother brother
//    }
//}


//Set - Immutable set

//fun main(){
//    val family = setOf("father", "mother", "mother", "brother", "brother", "sister")
//
//    for (i in family){
//        print("$i ") //father mother brother sister
//    }
//}

//Set - Mutable set

//fun main(){
//    val family = mutableSetOf("father", "mother", "mother", "brother", "brother", "sister")
//
//    family.add("grandmother")
//    family.remove("sister")
//
//    for( i in family){
//        print("$i ") //father mother brother grandmother
//    }
//}

//Map -  Immutable map

//fun main(){
//    val grade = mapOf("stu1" to "A", "stu2" to "B", "stu3" to "A")
//
//    println(grade["stu1"]) //A
//
//    println("All Students : ${grade.keys}") // All Students : [stu1, stu2, stu3]
//
//    println("All Grades : ${grade.values}") // All Grades : [A, B, A]
//
//}

//Map - Mutable map

fun main(){
    val grade = mutableMapOf("stu1" to "A", "stu2" to "B", "stu3" to "A")

    grade.remove("stu1")
    grade["stu4"] = "C"

    println("All Students : ${grade.keys}") // All Students : [stu2, stu3, stu4]

    println("All Grades : ${grade.values}") // All Grades : [B, A, C]

}