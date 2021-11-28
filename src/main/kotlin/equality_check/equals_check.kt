package equality_check

fun main() {
    val list1 = listOf("1", "2", "5")
    val list2 = listOf("1", "2", "5")


    println("list1.equals(list2) : ${list1 == list2}")
    println("same reference : ${list1 === list2}")
}

data class Person(val name: String)