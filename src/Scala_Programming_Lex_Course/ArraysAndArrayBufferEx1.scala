

package Scala_Programming_Lex_Course

object ArraysAndArrayBufferEx1 {
  def main(args:Array[String]): Unit = {
    val scores=Array(281,344,265,272,236,324,287)
    var avg=0
    var no_ab_avg=0
    var no_eq_avg=0
    var no_bel_avg=0
    for(i<-0 until scores.length){
      avg +=scores(i)      
    }
    for( i <- 0 until scores.length){
      if(scores(i)>avg/scores.length){
        no_ab_avg +=1
      }
      else if(scores(i)<avg/scores.length){
        no_bel_avg +=1
      }
      else if(scores(i)==avg/scores.length){
        no_eq_avg +=1
      }
    }
    println("The average score of the team is "+avg/scores.length+" runs")
    println("No. of matches scored above average is "+no_ab_avg)
    println("No. of matches scored equal to average is "+no_eq_avg)
    println("No. of matches scored below average is "+no_bel_avg)

  }
}