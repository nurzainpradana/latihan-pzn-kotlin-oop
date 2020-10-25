package data

class Laptop(val name: String) { // Secara default : Any()

}

open class HandPhone(val name: String) {

}

class SmartPhone(name: String, val os: String) : HandPhone(name){

}