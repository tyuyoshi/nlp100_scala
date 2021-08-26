object ans09 {
  import scala.util.Random

  def main(args: Array[String]) :Unit = {
    val text = "I couldn’t believe that I could actually understand what I was reading : the phenomenal power of the human mind ."
    println(shuffleWords(text).mkString(" "))
  }

  def shuffleWords(text: String) :Array[String] = {
    val chars = text.split(" ")
    chars.map{c =>
      val cLength = c.length
      if (cLength > 4){
        val initialChar = c(0).toString
        val endChar = c(cLength - 1).toString
        val betweenChars = c.slice(1,cLength-1)
        val shuffleChars = Random.shuffle(betweenChars.toList)
        initialChar + shuffleChars.mkString("") + endChar
      }else{
        c
      }
    }
  }
}