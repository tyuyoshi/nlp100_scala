object ans07 {
  def main(args: Array[String]) :Unit = {
    println(placeholder("x時のyはz", Map("x"->2, "y" -> "気温", "z" -> 22.4)))
  }

  def placeholder(template: String, mapTexts: Map[String, Any]) :String = {
    val stringMapText = mapTexts.view.mapValues(_.toString).toMap
    var replaceTemplate = template
    for ((k,v) <- stringMapText){
      if (replaceTemplate.contains(k)){
        replaceTemplate = replaceTemplate.replace(k,v)
      }
    }
    replaceTemplate
  }
}