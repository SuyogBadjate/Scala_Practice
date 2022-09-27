

package Scala_Programming_Lex_Course

object ArraysAndArrayBufferEx3 {
      def main(args:Array[String]): Unit = {
        val randInt=scala.util.Random.nextInt(11)
        var wantToPlay1=true
        while(wantToPlay1){
         val input=scala.io.StdIn.readInt()
         
         if(input==randInt){  
           wantToPlay1=false
           println("Correct right number")
         }else if(input>randInt){ 
           println("Lower Number")
         }else if(input<randInt){ 
           println("Greater number")
         }
         }
        
         
      }
      
}