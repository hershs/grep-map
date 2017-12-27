fun main(args: Array<String>) {
    val event = mapOf("aa" to 1, "bb" to 2, "cc" to 3)
    val dims = listOf("aa", "cc")
    println(event.filter { dims.contains(it.key) }.map { it.value })
}