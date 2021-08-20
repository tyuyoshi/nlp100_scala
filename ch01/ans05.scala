object ans05 {
  def main(args: Array[String]) :Unit = {
    val text = "I am an NLPer"
    val pureText = text.replace(",", "").replace(".", "")
    println("単語 bi-gram")
    word_n_gram(2, pureText).foreach(println(_))
    println("文字 bi-gram")
    letter_n_gram(2, pureText).foreach(println(_))
  }

  def word_n_gram(n: Int, sentence: String) :Array[String] = {
    val words = sentence.split(" ")
    n_gram(n, words)
  }

  def letter_n_gram(n: Int, sentence: String) :Array[String] = {
    val letters = sentence.replace(" ", "").split("")
    n_gram(n, letters)
  }

  def n_gram(n: Int, target: Array[String]) :Array[String] = {
    val count = target.length - n + 1
    val n_gram = new Array[String](count)
    for (i <- 0 to count - 1){
      n_gram(i) = target.slice(i, i+n).mkString(" ")
    }
    n_gram
  }
}