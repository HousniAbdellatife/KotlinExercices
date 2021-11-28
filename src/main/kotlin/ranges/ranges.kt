package ranges

fun main() {
    for (i in 1..5) print(i)

    println()

    for (i in 1 until 5) print(i)

    println()

    for (i in 1..9 step 2) print(i)

    println()

    val n = 5
    for (i in n downTo 1) print(i)

    println()

    for (c in 'a'..'f') print(c)


    // if
    val x = 2
    if (x in 1..5) println("x in the range")
    if (x !in 4..6) println("x is not in the range")
}