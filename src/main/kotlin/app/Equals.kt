package app

import data.Company

fun main() {
    val company1 = Company("Zain")
    val company2 = Company("Zain")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)

    println(company1.equals(company2))
}