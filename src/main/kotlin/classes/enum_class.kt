package classes

enum class COLOR(value: String){
    RED("RED") {
        override fun getValue(): String {
            TODO("Not yet implemented")
        }
    },
    WHITE("WHITE") {
        override fun getValue(): String {
            TODO("Not yet implemented")
        }
    },
    BLUE("BLUE") {
        override fun getValue(): String {
            TODO("Not yet implemented")
        }
    };

    abstract fun getValue(): String;
}

fun main() {
    val color: COLOR = COLOR.valueOf("RED")
    val colors: Array<COLOR> = COLOR.values();

    println(color)
    println(colors)
}