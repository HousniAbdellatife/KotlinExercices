package classes


fun main() {
    // object expression
    val school = object {
        var numberOfStudents: Int = 200
        var numberofClasses: Int = 30
    }

    val b = SingletonClass.numberOfCustomers;
    println(b)
}


// equivalent of Singleton class
object SingletonClass {
    // static attribut
    val numberOfCustomers = 34;
}