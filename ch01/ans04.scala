object ans04 {
  def main(args: Array[String]) :Unit = {
    val text = "Hi He Lied Because Boron Could Not Oxidize Fluorine. New Nations Might Also Sign Peace Security Clause. Arthur King Can."
    val pureText = text.replace(",", "").replace(".", "")
    val splitText = pureText.split(" ")
    val binaryIndex = Set(1, 5, 6, 7, 8, 9, 15, 16, 19)

    val elementMap = splitText.zipWithIndex.map{ case(element:String, i:Int) => 
      if (binaryIndex.contains(i)){
        element.substring(0,2)
      }else{
        element.substring(0,1)
      }
    }.zipWithIndex.map{ case(elementKey:String, i:Int) => 
      (elementKey, splitText(i))
    }.toMap
    
    println(elementMap)
  }
}