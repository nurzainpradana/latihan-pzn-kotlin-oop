package app

import data.Address

fun main() {
    val address = Address("Jl. Kampung Selang Cau", "Bekasi")
    val address2 = Address("Jl. Kampung Selang Cau", "Bekasi", "Indonesia")

    println(address.street)
    println(address2.street)

}