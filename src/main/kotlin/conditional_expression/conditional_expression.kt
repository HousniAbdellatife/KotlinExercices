package conditional_expression

fun main() {
    // in kotlin there is no ternary operator

    // if expression
    val a = 2
    val b = 4
    val c = if (a < b) b else a
    print(c)
}