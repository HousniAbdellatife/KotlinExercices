package example1

/**
 * Lambdas
 */

fun main() {
    val list = listOf(3, 4, 90)
    println(containsEven(list))
}

fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { n -> n % 2 == 0 }