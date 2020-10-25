package app

import data.City
import data.Country
import data.Location

fun main() {
    // val location = Location("Zain") ERROR, abstract class tidak bisa dibuat object
    val city = City("Bekasi")
    val country = Country("Jawa Barat")

    println(city.name)
    println(country.name)
}