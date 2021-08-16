object ans03 {
  def main(args: Array[String]) :Unit = {
    val text = "Now I need a drink, alcoholic of course, after the heavy lectures involving quantum mechanics."
    val pureText = text.replace(",", "").replace(".", "")
    val splitText = pureText.split(" ")
    println(splitText.map(_.length).mkString(" "))
  }
}