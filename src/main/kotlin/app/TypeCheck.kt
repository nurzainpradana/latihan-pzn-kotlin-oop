package app

import data.HandPhone
import data.Laptop


fun printObject(any: Any){
    /* IF Expression
    if (any is Laptop){
        // any dikonversi menjadi tipe data yang di check
        println("Laptop with name ${any.name}")
    } else if (any is HandPhone){
        println("HandPhone with name ${any.name}")
    } else
        println(any)

     */

    // WHEN EXPRESSION
    when(any){
        is Laptop -> println("Laptop ${any.name}")
        is HandPhone -> println("Handphone ${any.name}")
        else -> println(any)
    }
}

fun main() {
    printObject("Zain")
    printObject(1)
    printObject(Laptop("Acer"))
    printObject(HandPhone("Samsung"))

}