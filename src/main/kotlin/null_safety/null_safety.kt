package null_safety

fun main() {
    // variable types in Kotlin don't allow the assignment of null
    // If you need a variable that can be null, declare it nullable by adding ? at the end of its type.

    var notNull: String = "this is not null"
    //notNull = null        // you cannot write this assignement, compiler error


    var nullable: String? = "this can be null"
    nullable = null


    var inferredNotNull = "The compiler assumes not null type"
}