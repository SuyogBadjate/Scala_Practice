package Scala_Programming_Lex_Course

import scala.collection.mutable.ArrayBuffer


object ArraysAndArrayBufferEx2 {
    def main(args:Array[String]): Unit = {
      val ArrBuffer=ArrayBuffer(1,3)
      for(i<-1 until 10){
        ArrBuffer += ArrBuffer(ArrBuffer.length-1)*ArrBuffer(ArrBuffer.length-2)
      }
      for(i<-ArrBuffer){
        println(i)
      }
        
    }

}