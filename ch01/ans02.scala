object ans02 {
  def main(args: Array[String]) :Unit = {
    val text1 = "パトカー"
    val text2 = "タクシー"
    val index = Array(0,1,2,3)
    val concatText = index.map{ ind =>
      text1.substring(ind, ind+1) + text2.substring(ind, ind+1)
    }
    println(concatText.mkString(""))
  }
}