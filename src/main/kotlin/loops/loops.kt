package loops

// for while do-while
fun main() {

    var list = listOf("a", "b", "c")
    for (element in list) {
        println("$element")
    }

    println("-----------------------------")

    val iterator = list.iterator()
    while (iterator.hasNext()) {
        println("${iterator.next()}")
    }

    println("------------------------------")

    var n = 0
    do {
        println("kotlin")
    }while (++n < 5)

    println("------------------------------")

    var order = Order(listOf(Product("p1", 12.0), Product("p2", 33.5)))
    for (product in order) {
        println(product)
    }


}


data class Product(val name: String, val price: Double)
class Order(val products: List<Product>) {
    operator fun iterator(): Iterator<Product> = products.iterator()
}