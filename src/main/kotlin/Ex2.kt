package example1

/**
 * Named Arguments
 */
fun main() {

    println(joinOptions(listOf("a", "b", "c")))
}

fun joinOptions(options: Collection<String>) =
    options.joinToString(", ", prefix = "[", postfix = "]")
