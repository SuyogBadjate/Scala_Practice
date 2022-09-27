

package Scala_Programming_Lex_Course

object ArraysAndArrayBufferEx {
  def main(args:Array[String]){
    val floors=Array(Array(0,"Ground Floor",100),Array(1,"First Floor",200),Array(2,"Second Floor",150))
    
    
    for(i<-0 until floors.length){
      for(j<-0 until floors(i).length){
         println(floors(i)(j))
      }
    }
    
  }
  
}