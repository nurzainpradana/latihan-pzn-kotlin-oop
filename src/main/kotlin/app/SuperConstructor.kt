package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main() {
    val premiumCustomer = PremiumCustomer("Zain")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Pradana", 100)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}