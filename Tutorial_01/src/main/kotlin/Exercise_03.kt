fun main(){
    var mark = 85

    if(mark<=100 && mark>=75){
        println("Grade A")
    }else if(mark<=74 && mark>=65){
        println("Grade B")
    }else if(mark<=64 && mark<=50){
        println("Grade C")
    }else if(mark<=49 && mark<=35){
        println("Grade D")
    }else if(mark<=34 && mark<=0){
        println("Grade F")
    }else{
        println("Not a Valid Range")
    }
}