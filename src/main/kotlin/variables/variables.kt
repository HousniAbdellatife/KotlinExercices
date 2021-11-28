package variables

fun main() {
    var a: String = "initial"  // 1
    println(a)
    val b: Int = 1             // 2
    val c = 3                  // type inference

    // You're free to choose when you initialize a variable, however, it must be initialized before the first read,
    // or you get compiler error: Variable 'e' must be initialized.
}