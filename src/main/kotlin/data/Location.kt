package data

abstract class Location(val name: String)
// default abstarct itu open

class City(name: String) : Location(name)

class Country(name: String) : Location(name)

