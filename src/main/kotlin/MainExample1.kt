class Person(var firstName: String, val lastName: String) {

    val completeName: String
        get() = "$firstName $lastName"

    var age: Int = 0

    init {
        println("firstName: $firstName lastName: $lastName")
    }
}

fun main() {
    val p = Person("Dev", "Tech")

    println(p)
    p.firstName = "Desenv"
    println(p.firstName)
    println(p.lastName)
    println(p.completeName)
    p.age = 30
    println(p.age)
}