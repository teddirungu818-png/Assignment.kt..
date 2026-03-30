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


}
