package functional

// A higher-order function is a function that takes another function as parameter and/or returns a function.

fun calculate(x: Int, y: Int, operation: (Int, Int) -> Int): Int {  // 1
    return operation(x, y)                                          // 2
}

fun mult(x: Int, y: Int) = x * y                                     // 3

fun main() {
    val sumResult = calculate(4, 5, ::mult)                          // 4
    val mulResult = calculate(4, 5) { a, b -> a * b }               // 5
    println("sumResult $sumResult, mulResult $mulResult")
}