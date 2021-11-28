
// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer.getOrderedProducts().asSequence().sortedByDescending{it.price}.firstOrNull()
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    return this.customers.flatMap{it.getOrderedProducts()}.filter{it == product}.count()
}


class Shop(val customers: List<Customer>)

fun Customer.getOrderedProducts(): List<Product> =
    this.orders.flatMap{it.products}.toList()
class Product(val price: Double)
class Customer(val orders: List<Order>)

class Order(val products: List<Product>)