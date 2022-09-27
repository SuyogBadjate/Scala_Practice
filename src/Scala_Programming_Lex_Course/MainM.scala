package Scala_Programming_Lex_Course

import scala.collection.mutable.ArrayBuffer

object Main {

  //  var name="Emp1"
  //  var age=24
  //  val joining_date="24-Nov-2021"
  //  def displayProfile(name:String,age:Int,joining_date:String):Unit={
  //    println("name:\t"+name+"\nage:\t"+age.toDouble+"\nJoining date:\t"+joining_date)
  //  }
  def main(args: Array[String]) {
    //    println("Scala is Multi-paradigm")
    //
    //    //code to display usage of escape sequence
    //
    //      println("Escape Sequence: \"Have\ta nice\n\nDay\"" );
    //
    //       /*code to display usage of identifiers*/
    //
    //      var _employeeName="Sharon John"
    //
    //      println("Identifier: "+_employeeName)
    //
    //      println("Data type of _employeeName: "+_employeeName.getClass())
    //
    //      // code to display usage of multi-line String
    //      var scalaLiteral="""I hava a
    //                            pet
    //                           Dog!!!!!!"""
    //      println("Multi-line literals: "+scalaLiteral)
    //
    //
    //      var name="Suyog"
    //      println("Name is:\t"+name.getClass())

    //        var x = "Hello World".split(" ")
    //        print(x(0)+" "+x(1))

    //    var empSalary = "8000"
    //    var empHike = empSalary.toInt + 500
    //    println("Value of empSalary after Conversion to Int: " + empHike)
    //    println("Value of empSalary after Conversion to Double: " + empSalary.toDouble)
    //    val empRating = 1
    //    empRating=3
    //    println("Value of empRating after Conversion to String: " + empRating.toString() + " is Sharon Rating for this cycle")

    //    displayProfile("Suyog", 24, "23-Nov-2021")

    //    var empLockerID: Array[Int] = Array(10, 20, 30, 40, 50)
    //    for (i <- 0 until empLockerID.length) {
    //      empLockerID(i) = empLockerID(i) * 100
    //      println(empLockerID(i))
    //    }

//    //Sample 1
//    var employeeMatrix = Array.ofDim[Int](3, 3)
//    //Sample 2
//    var empRating: Array[Array[Int]] = new Array[Array[Int]](2)
//    empRating(0) = new Array[Int](3)
//    empRating(1) = new Array[Int](4)
//    empRating(0)(0) = 1
//    empRating(0)(1) = 2
//    empRating(0)(2) = 3
//    println("Employee Rating Is: " + empRating(0)(0) + " " + empRating(0)(1) + " " + empRating(0)(2))

//      var empCount = new ArrayBuffer[Int] ( ) //empty buffer is created
//      empCount+= 1		//empCount(1)
//      empCount += ( 2 , 3 , 4 , 5 )	//empCount( 1 , 2 , 3 , 4 , 5 )
//      for(i<-0 until empCount.length){
//        print(empCount(i)+"\t")
//      }
    
    //Arrays methods
//    var empSalary = Array(5000, 2500, 2000, 3400)
//      
//      // Print all the array elements
//      println("Employee Salary:")
//      for ( sal <- empSalary ) {
//         println(sal)
//       }
//    
//    // Summing all elements
//      var totalSalary = 0;
//      for ( i <- 0 to (empSalary.length - 1)) {
//         totalSalary += empSalary(i);
//      }
//      println("Total Salary is: " + totalSalary);
//      
//      // Finding the largest element
//      var maxSal = empSalary(0);
//      for ( i <- 1 to (empSalary.length - 1) ) {
//         if (empSalary(i) > maxSal) maxSal = empSalary(i);
//      }
//      println("Max Salary is: " + maxSal);
//      
//      //Using Range in Arrays
//      
//      var empHike1 = Range(10, 20, 2)
//      var empHike2 = Range(10,20)
//
//      // Print all the array elements
//      println("Range values for Employee Hike List1: ")
//      for ( employeeHike <- empHike1 ) {
//         print( " " + employeeHike )
//      }
//      println()
//        println("Range values for Employee Hike List2: ")
//      for ( employeeHike <- empHike2 ) {
//         print( " " + employeeHike )
//      }
//   println()
//   
//   //Multi-dimensional Arrays   
//   println("Employee Matrix")
//   var seatNo=1001
//      var employeeMatrix = Array.ofDim[Int](3,3)
//      for (row <- 0 to 2) {
//         for ( col <- 0 to 2) {
//            employeeMatrix(row)(col) = col+seatNo;
//         }
//         seatNo=seatNo+5
//      }
//      for (row <- 0 to 2) {
//         for ( col <- 0 to 2) {
//            print(" " + employeeMatrix(row)(col));
//         }
//         println();  
//     }
//
//      // Removing duplicate elements from the array using distinct
//         val empName = Array("Sharon", "John", "Sharon","Leon", "John")
//        val empDistinct=empName.distinct
//        println("Finding Distinct Employee Name:")
//        for(uniqueName <- empDistinct)
//          println(uniqueName)
    
    //ArrayBuffer methods
    var empCount = new ArrayBuffer[Int] ()

    empCount += 1
     println("Employee Count Value is: "+empCount)
     empCount+= ( 2 , 3 , 4 , 5 )
     println("Employee Count Value is: "+empCount)
     empCount.trimEnd(2) 
     println("Employee Count Value after Trim: "+empCount)
     empCount.insert( 3 , 4 ) 
     println("Employee Count Value after insert: "+empCount)
    empCount.insert( 4 , 5 , 6  , 7,7 )  
     println("Employee Count Value after insert: "+empCount)
     empCount.remove(2)
     println("Employee Count Value after remove: "+empCount)
     empCount.remove( 2 , 4 )
     println("Employee Count Value after remove: "+empCount)
    
   
    
  }
}