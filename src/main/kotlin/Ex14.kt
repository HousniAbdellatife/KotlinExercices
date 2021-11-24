package example1

/**
 * Comparison
 */

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(date: MyDate): Int {
        if (this.year != date.year) return this.year - date.year;
        if (this.month != date.month) return this.month - date.month;
        if (this.dayOfMonth != date.dayOfMonth) return this.dayOfMonth - date.dayOfMonth;
        return 0
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}