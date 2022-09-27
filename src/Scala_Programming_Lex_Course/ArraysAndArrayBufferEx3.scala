

package Scala_Programming_Lex_Course

object ArraysAndArrayBufferEx3 {
      def main(args:Array[String]): Unit = {
        val randInt=scala.util.Random.nextInt(11)
        var wantToPlay=true
        while(wantToPlay){
         val input=scala.io.StdIn.readInt()
         
         if(input==randInt){  
           wantToPlay=false
           println("Correct right number")
         }else if(input>randInt){ 
           println("Lower Number")
         }else if(input<randInt){ 
           println("Greater number")
         }
         }
        
         
      }
      
}