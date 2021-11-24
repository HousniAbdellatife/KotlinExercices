package example1

fun evaluate(expr: Expression): Int =
    when (expr) {
        is Number -> expr.value
        is SumNum -> evaluate(expr.left) + evaluate(expr.right)
    }

sealed interface Expression
class Number(val value: Int) : Expression
class SumNum(val left: Expression, val right: Expression) : Expression