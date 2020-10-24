package app

import data.Person

fun main() {
    val zain = Person()
    zain.firstName = "Nur"
    zain.middleName = "Zain"
    zain.lastName = "Pradana"

    zain.sayHello("Dana")
    zain.run()
    val fullname = zain.getFullname()
    println(fullname)
}