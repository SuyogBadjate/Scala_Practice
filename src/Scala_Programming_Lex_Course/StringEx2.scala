package Scala_Programming_Lex_Course

object StringEx2 {
  private val emailRegex = """^[a-zA-Z0-9\.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$""".r
  def check(e: String): Boolean = e match {
    case null => false
    case e if e.trim.isEmpty => false
    case e if emailRegex.findFirstMatchIn(e).isDefined => true
    case _ => false
  }
  def main(args: Array[String]): Unit = {
    val email="http://www.infosys.com"  
    println(check(email))
  }
}