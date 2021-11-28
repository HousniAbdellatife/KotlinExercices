package functions

fun main() {
    printMessage("Hello Kotlin")
    printMessage()
    sum(2,4)
    println(2 times "hello ")
    println("hello " * 3)
    println(concatenateNames("a", "b", "c"))
}

// Unit equivalent to Avoid in Java
// there is no need for adding Unit, Kotlin take care of it
fun printMessage(message: String = "Default message : There is no message") : Unit {
    println(message)
}

// if a function contains only one statement or expression, there is no need of return and curly brackets
fun sum(a: Int, b: Int): Int = a + b


// Infix function
// Functions marked with the infix keyword can also be called using the infix notation (omitting the dot and the parentheses for the call)
infix fun Int.times(s: String): String = s.repeat(this)

// operator function
// Certain functions can be "upgraded" to operators, allowing their calls with the corresponding operator symbol
operator fun String.times(n: Int): String = this.repeat(n) + " end."



//varargs
fun concatenateNames(vararg names: String): String = names.joinToString()