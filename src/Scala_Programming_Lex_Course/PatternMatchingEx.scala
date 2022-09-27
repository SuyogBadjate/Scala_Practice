

package Scala_Programming_Lex_Course

object PatternMatchingEx {
  def main(args: Array[String]): Unit = {
    
    
        //Tryout if-else 
      val certScore = 88
      val certResult =
      if ( certScore>=65 )
             "Passed" 
      else
             "Failed"
      println("Result: " + certResult)
           
        //Tryout pattern matching
      println(matchType1("two"))
      println(matchType1("test"))
      println(matchType1(1))
      println(matchType1(2))
      println(matchType1(5))
   
   
   def matchType1(checkType: Any): Any = checkType match {
      case 1 => "one"
      case "two" => 2
      case y: Int => "scala.Int"
      case unknown => "many"
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    def matchCourse(course: String): String =course match 
{      
  case "ruby" => "rails"
  case "scala" => "play"
  case "groovy" => "grails"
  case _ => "No Course"
} 
    def matchType(checkType: Any): Any = checkType match {
      case 1005 => "Its Integer"
      case "John" => "Its String"
      case salary: Double => "Its Double"
      }
    println(matchCourse("ruby"))
    println(matchCourse("java"))
    println(matchType(1005))
  }
}