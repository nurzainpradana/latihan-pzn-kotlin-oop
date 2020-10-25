package app

fun printStringSafeNullable(any: Any){
    val value: String? = any as? String
    println(value)
}

fun main() {
    printStringSafeNullable("Zain") // Success
    printStringSafeNullable(1) // null

}
