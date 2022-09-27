

package Scala_Programming_Lex_Course

object ExceptionsFilehandling extends App{
//  def buyProduct(pId: Int) = {
//    try {
//      if (pId == 0)
//        throw new Exception("Product out of stock")
//      else
//        false
//    } catch {
//      case e: Exception => println(e.getMessage)
//    } finally {
//      println("Closing database connections")
//    }
//}
//  buyProduct(0)
  
//  import java.io._
//val writer = new PrintWriter(new File("test.txt"))
//writer.write("Scala is a scalable language")
//writer.close()

import scala.io.Source
println("Contents read:" )
Source.fromFile("test.txt" ).foreach{ 
     print 
}

import java.io._
val fw = new FileWriter("test.txt", true)
fw.write("This line appended to file!")  
fw.close()


}