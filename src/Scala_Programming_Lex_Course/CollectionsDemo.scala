package Scala_Programming_Lex_Course

import scala.collection.Seq

//case class Employee(
//  empId: Int,
//  empName: String,
//  empSalary: Float,
//  empGender: Option[String])


object CollectionsDemo extends App {
//    val empNumList_1: ListBuffer[Int] = ListBuffer(1001, 1002, 1002, 1003)
//    empNumList_1 += 1004 // Adding an element
//    empNumList_1 -= 1002 // Removing an element
//    println("empNumList_1: "+empNumList_1)
//
//    val empNumList_2: List[Int] = List(1006, 1007, 1008)
//    val empListBuffer = empNumList_1 ++ empNumList_2 // Type of allEmpNums will be ListBuffer
//    println("Employee List Buffer: "+empListBuffer)
//    val empList = empNumList_1 ++: empNumList_2 // Type of allEmpNums_1 will be List
//    println("Employee List: "+empList)
//
//    println(1001 +: empListBuffer) // Prepending
//    println(empList :+ 1001) // Appending
//    println(empList ::: List(1097, 1098, 1099)) // Adding elements from another list
//    println(1099 :: empList) // Adding element to the beginning
//    println((10 /: empNumList_2)(_ + _)) // foldLeft using addition
//    println((empNumList_2 :\ 10)(_ * _)) // foldRight using multiplication
    
    
//    private val employees = Map(1 -> Employee(10, "John", 52000.0f, Some("male")),
//    2 -> Employee(12, "Sharon", 7000.0f, Some("female")))
//   println("First Employee: " + showEmployee(employees.get(2)))
//   println("Third Employee : " + showEmployee(employees.get(3)))
//      
//    def showEmployee(x: Option[Object]) = x match {
//      case Some(s) => s
//      case None => "No Such Employee exists!!"
//   }
//   
//    //getorElse
//      val empId:Option[Int] = Some(1005)
//      val empName:Option[Int] = None 
//      
//      println("Employee ID: " + empId.getOrElse(0) )
//      println("Employee Name: " + empName.getOrElse("SharonJohnJ") )
//  
//  val numbers = List(5, 4, 8, 6, 2)
//    println(numbers.foldRight(5) { (z, i) => z + i})
//    
//    
//    println(numbers.foldLeft(List[Int]()) ( (z, i) => i::z ) )
//    
//    var sal:Seq[Int] = Seq(5000,8500,100,8000,3000,700,2000)  
//        print("Salary Details: ");
//        sal.foreach((salDet:Int) => print(salDet+" "))  
//       println("\nEmpty or Not?: "+sal.isEmpty)  
//        println("Ends with (700,2000): "+ sal.endsWith(Seq(700,2000)))  
//       println("contains 100: "+ sal.contains(100))  
//        println("Reverse : "+sal.reverse)  
//        
//        val empGrade = List("a", "b", "c")
//    val empId = List(101, 201, 301)
//    println("Zipped Vaues: "+empGrade.zip(empId))
//     
//    var empScore = List(40, 50, 60, 70)
//    println("Zipped Vaues arr1 and arr3: "+empGrade.zip(empScore))
//    
//    val products = Array("breadsticks", "pizza", "soft drink")
//    val prices = Array(4)
//    val productsWithPrice = products.zip(prices)
//    println(productsWithPrice.mkString(" "))
//    //Unizip
//    val (a,b) = productsWithPrice.unzip
//    println(a.mkString(" "))
//        
//        val empList = List(15, 10, 5, 8, 20, 12)
//   println("Partition: "+empList.partition(_ > 10))
  
  val fruits = Seq("apple", "banana", "orange")
    println("Map: "+fruits.map(_.toUpperCase))
    println("Flat Map: "+fruits.flatMap(_.toUpperCase))
    
    val strings = Seq("1", "2", "foo", "3", "bar")
    val mapRes=strings.map(toInt)   
    println("Using Map: "+strings.map(toInt)) 
    println("Using flatMap: "+strings.flatMap(toInt))
    println("Using flatmap: "+strings.flatMap(toInt).sum)
    
     def toInt(in: String): Option[Int] = {
    try {
        Some(Integer.parseInt(in.trim))
    } catch {
        case e: Exception => None    }
  }

}