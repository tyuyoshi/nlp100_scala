object ans08 {
  def main(args: Array[String]) :Unit = {
    val text = "Hi, my name is Tyuyoshi"
    println(new String(text.map(cipher(_)).toArray))
  }

  def cipher(text: Char) :Byte = {
    if (text.isLower){
      (219 - text.toInt).toByte
    }else{
      text.toInt.toByte
    }
  }
}