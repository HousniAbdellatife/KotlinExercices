package hello_world


// main is the entry point
// there is two options with args or without
// main with args has more priority
fun main() {
    println("Hello World Without args")
}

fun main(args: Array<String>) {
    println("Hello World With args")
}