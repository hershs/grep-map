object TestScala extends App {
  val event = Map("aa" -> 1, "bb" -> 2, "cc" -> 3)
  val dims = List("aa", "cc")

  print(event.filter(e => dims.contains(e._1)).map { case (k, v) => (v) }.toList)
}
