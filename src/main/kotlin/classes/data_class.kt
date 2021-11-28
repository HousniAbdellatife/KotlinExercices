package classes

// The compiler automatically derives the following members from all properties declared in the primary constructor:
// equals()/hashcode()     toString()     componentN()      copy()
// All primary constructor parameters need to be marked as val or var
// Data classes cannot be abstract, open, sealed, or inner.
data class Person(val name: String, val age: Int)


fun main() {
    val p = Person("John", 34)
    println(p)
    println(p.hashCode())
    println(p === p.copy())
    println("component1 : ${p.component1()}")
    println("component2 : ${p.component2()}")
}