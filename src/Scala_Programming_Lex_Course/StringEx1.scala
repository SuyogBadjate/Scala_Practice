
package Scala_Programming_Lex_Course

import scala.util.control.Breaks._
object StringEx1 {
  def main(args: Array[String]): Unit = {
    val str="welcome to the next generation experience"
    var strSplit = str.split(" ") //splits str into "hello" and "world"
    var res=""
    var str1=""
    var str2=""
    for(i<- 0 until strSplit.length){
       str1=strSplit(i).substring(1)
       str2=strSplit(i).substring(0, 1)
       res=str1+str2+"ay"
       strSplit(i)=res
    }
    
    val mkStr=strSplit.mkString(" ") //combines strSplit into "hello world"
    println(mkStr) //prints hello world
  }
}