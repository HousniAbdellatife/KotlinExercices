package control_flow

fun main() {
    val num = 5;
    whenStatement(num)
    val ans = whenExpression(num)
    println(ans)

}

fun whenExpression(num: Int): Int {
    return when(num) {
        2 -> num * 1
        6 -> num * 2
        else -> num * 4
    }
}

fun whenStatement(num: Int) {
    when (num) {
        1 -> println(1)
        2 -> {
            println(2)
            println(2)
        }
        is Int -> println("is Int")
        5 -> println(5)
        else -> throw IllegalArgumentException("error in number")
    }
}