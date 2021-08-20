object ans06 {
  def main(args: Array[String]) :Unit = {
    val text1 = "paraparaparadise"
    val text2 = "paragraph"
    val collection1 = letter_n_gram(2, text1).toSet
    val collection2 = letter_n_gram(2, text2).toSet
    println("和集合")
    println(collection1 intersect collection2)
    println("積集合")
    println(collection1 & collection2)
    println("差集合")
    println(collection1 &~ collection2)
  }

  def letter_n_gram(n: Int, sentence: String) :Array[String] = {
    val letters = sentence.replace(" ", "").split("")
    n_gram(n, letters)
  }

  def n_gram(n: Int, target: Array[String]) :Array[String] = {
    val count = target.length - n + 1
    val n_gram = new Array[String](count)
    for (i <- 0 to count - 1){
      n_gram(i) = target.slice(i, i+n).mkString("")
    }
    n_gram
  }
}