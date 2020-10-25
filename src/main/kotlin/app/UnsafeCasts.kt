package app

fun printString(any: Any){
    val value = any as String
    println(value)
}

fun main() {
    printString("Zain") // Success
    printString(1) // ClassCastException
}