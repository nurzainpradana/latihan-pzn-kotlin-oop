package app

import data.SmartPhone

fun main() {
    val smartPhone = SmartPhone("Samsung S10", "Android ")

    // Method dari Any Class
    println(smartPhone.toString())
    println(smartPhone.hashCode())
}