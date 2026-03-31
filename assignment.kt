fun main() {
//TEDD IRUNGU.K//	
println("===SECTION 1:VARIABLES & DATATYPES===")  //section 1//  
    println("Field Value Mutability")

   	var name:String="Alex Morgan"   //task 1.1
   	val studentId:Int=2024001
   	var GPA:Float=3.75f
   	val isEnrolled: Boolean = true
   	val middleInitial:Char= 'J'	
    var phoneNumber:String?=null  //task1.3

   
   
   print(name)
   print("."+middleInitial)
   print('('+"ID: "+studentId+')')
   print(" has GPA "+GPA)
   print(" and is enrolled:"+ true)
   println( phoneNumber) 
println("=============================================================")   
println("===SECTION 2: FUNCIONS===") //section 2//
fun displayMenu(){                  //task 2.1//
    println("=== MENU ===")
    println("1.View Profile")
    println("2.Edit Settings")
    println("3.Logout")
    println("=================")
}
displayMenu()
 
var price:Double =100.5469      //task 2.2//  
var discountPercent:Double=20.5678

fun calculateDiscount(price: Double,discountPercent: Double):Double{
    return price-(price * discountPercent/ 100)
	
}
 println(calculateDiscount(price, discountPercent))


    
fun getGrade(score:Int):String{     //task 2.3//
   if(score>= 80){
       return "A"
   }else if(score >= 65){
       return "B"
   }else if(score>= 50 ){
       return "C"
   }else if(score>=35){
       return "D"
   }else{
       return "F"
   }
   
}
println(getGrade(89))

fun isEven(number:Int):Boolean{  //task 2.4
    return number % 2 == 0
}
println(isEven(5))

//===SECTION 3===//
println("===SECTION 3:CONDITIONAL STATEMENTS===")
fun temperature(temp:Int):String{ //task 3.1//
    if (temp>30){
        return "Hot day"
    }else if(temp>=20){
        return "Perfect day"
    }else {
        return "Cool day"
    }
}

    println(temperature(28))

var dayOfWeek = "Monday" //task 3.2//

when(dayOfWeek){
    "Saturday","Sunday"->println("Weekend! Time to relax")
    "Monday"->println("Back to work")
    "Friday"->println("TGIF!")
    else->println("Regular weekday")
}
    

val trafficLight = "RED"  //task 3.3//
when(trafficLight){
    "RED" -> println("STOP")
    "YELLOW" -> println("CAUTION")
    "GREEN" -> println("GO")
    else -> println("INVALID")
}


//SECTION 4//
println("===SECTION 4:LOOPS===") //task 4.1
var start = 1
while(start<=10){
    println(start)
    start++
}
println("================================================================")
var X = 5           //task 4.2//
fun countdown(){
    do{
    println("Countdown:"+X--)
    
}while (X>=1)
}
countdown()
println("Blastoff")
println("============================================================")
val shoppingList = listOf("Milk","Eggs","Bread","Butter","Coffee") //task 4.3//
var index=1
for(shoppingList in shoppingList){
    println("[$index]"+shoppingList)
    index++
    }


}
