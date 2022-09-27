

package Scala_Programming_Lex_Course

object Loops {
  def main(args: Array[String]): Unit = {
    val empSalary = Array(5000, 2500, 4000, 2000, 6400);
    val salDetails = checkSalary(empSalary)
    if (salDetails == 1)
      print("Less Salary")
    else
      print("Not Less")
  }

  def checkSalary(salary: Array[Int]): AnyVal = {
    for(i<-0 to salary.length){
        while (salary(i)>0) {
            if(salary(i)<2000)
              return 1
            else
              return 
         }
  }
    }
}