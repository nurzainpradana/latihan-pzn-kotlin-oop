package app

import data.Person

fun main() {
    val zain = Person()
    zain.firstName = "Zain"

    zain.sayHello("Pradana")
    zain.sayHello("Nur", "Pradana")
}