internal class Person {
    private var fName: String? = null
    private var lName: String
    private var age: Int

    constructor(fName: String?, lName: String, age: Int) {
        this.fName = fName
        this.lName = lName
        this.age = age
    }

    constructor(lName: String, age: Int) {
        this.lName = lName
        this.age = age
    }
}