package app

import data.Rectangle

fun main() {
    val rectangle = Rectangle()
    println("Corner ${rectangle.corner}")
    println("Corner ${rectangle.parentCorner}")

    // Mengakses super function
    println(rectangle.printName())

}