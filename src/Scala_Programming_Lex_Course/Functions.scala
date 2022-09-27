package Scala_Programming_Lex_Course

import scala.annotation.tailrec


object Functions {
  //call by name
  //  def printResult(score: => Int) = { // note the syntax. Parameter name:<space>=>return type of the method
  //    println("Received parameter in printResult")
  //    println("Parameter in printResult : " + score)
  //    println("Parameter in printResult : " + score)
  //  }
  //
  //  def calculateScore(score1:Int,score2:Int)={
  //    println("Computed result in calculateScore : " + (score1+score2))
  //    score1+score2
  //  }
  //
  //  def main(args: Array[String]): Unit = {
  //    printResult(calculateScore(10, 20))
  //  }

  //call by value
  //  def printResult(score:Int)={
  //    println("Received parameter in printResult")
  //    println("Parameter in printResult : " + score)
  //    println("Parameter in printResult : " + score)
  //  }
  //  def calculateScore(score1:Int,score2:Int)={
  //    println("Computed result in CalculateScore : " + (score1+score2))
  //    score1+score2
  //  }
  //
  //  def main(args: Array[String]): Unit = {
  //    printResult(calculateScore(10, 20))
  //  }

  //def empOperation(funScore: Int => Int, score: Int) = if (score != 0) print(funScore(score)) else score
  def main(args: Array[String]): Unit = {
    //mpOperation((marks: Int) => marks * marks, 40);
     //High order function
//    println("Sum of Even Nos: "+genericTotal(empScore => empScore%2==0, List(12,23,36,45,58)) )         // Sum of even numbers
//    println("Sum of Odd Nos: "+genericTotal(empScore => empScore%2==1, List(12,23,36,45,58)))          // Sum of odd numbers
//    println("Sum of numbers greater than 3: "+genericTotal(empScore => empScore>3, List(2,23,36,45,58)))         
//    
//    //Default Parameters
//    println( "  Default Parameters with No argument : " + totalSalary() );
//    println( "  Default Parameters with 1 argument : " + totalSalary("Sharon") );
//    println( "  Default Parameters with 2 argument: " + totalSalary("John",3500) );    
    
//    val empScore = Array[Int](80, 45, 78, 65, 95)
//    println("Named Parameters: " + totalScore(divisor=4, empArray=empScore))
//    
//    //Variable arguments
//
//        print("Variable Arguments with 3 paramenters: ")
//       empDetails("1005", "Sharon", "Java");
//        print("Variable Arguments with 2 paramenters: ")
//        empDetails("1010", "John");
//        print("Variable Arguments with 1 paramenter: ")
//        empDetails("Mainframe");
//        print("Variable Arguments with 4 paramenters: ")
//         empDetails("1001", "Leon", "34000.00", "OS");
    
    val listOfNumbers = List.range(1, 1000000)
    
    /* Finding sum using recursion */
    //println(sumRec(listOfNumbers))
    
    /* Finding sum using tail recursion */
    println(sumTailRec(listOfNumbers))
    
    println(factorial(4))
  }
  
  // Sample 1: High Order
//    def genericTotal(funcScore: Int => Boolean, scoreList: List[Int]) = {
//    var sum = 0
//    scoreList.foreach{ score => if(funcScore(score)) sum += score } 
//    sum
//    }
//    
//    //Sample 2: High Order
//    def squareList(score: Int ) = score * score
//    val empScore = List( 12 , 24 , 36  , 48 , 50 )
//    val empResult = empScore.map( squareList )
//    println("High Order: "+ empResult ) 
//    
//    //Anonymous functions
//    var empHike = (totSalary: Int, hikePer: Int) => totSalary*hikePer/100
//    println("Anonymous Function: "+empHike(45000,5))
//   
//   //Default Parameters
//    def totalSalary( name:String="Janet", salary:Double=7500.00 ) : Double = {
//      var total:Double = 0
//      total = total + salary
//      print("Name: "+name)
//      return total
//   }
  
  //Named arguments functions
//  def totalScore(empArray: Array[Int], divisor: Int): Int = {
//    var total: Int = 0
//    for (score <- empArray) {
//      if (score % divisor == 0)
//        total += score    }
//    return total
//  }
//  
//  //Variable arguments Function
// def empDetails(args:String* ) = {
//      var count : Int = 0;
//      for( employee <- args ){
//         println("Employee Details[" + count + "] = " + employee );
//         count = count + 1;
//      }
//   }
  
  // A recursive function to calculate the sum of the first n numbers
    def sumRec(numbers: List[Int]): Int = {
    numbers match {
      case Nil => 0
      case total :: tail => total + sumRec(tail)
    }
  }
  
  // A tail recursive function to find the sum of the first n numbers
  def sumTailRec(numbers: List[Int]): Int = {
    def sumOf(numbers: List[Int], sum: Int): Int = {
      numbers match {
        case Nil => sum
        case total :: tail => sumOf(tail, sum + total)
      }
    }
    sumOf(numbers, 0)
  }
  
  // Function to calculate the factorial of a number
  def factorial(number: Int): Int = {
    @tailrec
    def factorialOf(number: Int, factorial: Int): Int = {
      if (number != 0) factorialOf(number - 1, factorial * number)
      else  factorial 
    }
    factorialOf(number, 1)
  }
}