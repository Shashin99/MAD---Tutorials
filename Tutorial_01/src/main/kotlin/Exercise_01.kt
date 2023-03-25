//Create an array that contains the module names, that you’ll learn in this semester

fun main(){

    var semesterModules = arrayOf("MAD","DSA","PS","PSkills","IPT","ESD")

    println()
    println("Modules in the Semester ------- Y2S2 -----")
    for (i in semesterModules)
        println(i)

    println()
    println("display in reverse order")
    semesterModules.reverse()
    println(semesterModules.contentToString())
}