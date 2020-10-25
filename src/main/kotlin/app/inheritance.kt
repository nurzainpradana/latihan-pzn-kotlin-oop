package app

import data.Manager
import data.VicePresident

fun main() {
    // mengakases behaviour Employee
    val manager = Manager("Zain")
    manager.sayHello("Pradana")

    // mengakases behaviour Employee
    val vicePresident = VicePresident("Nur")
    vicePresident.sayHello("Ahmad")
}