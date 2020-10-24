package data

class Person{
    var firstName: String = ""
    //val firstName: String = "" //
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String): Unit{
        println("Hello $name, my name is $firstName")
    }

    fun run(){
        println("I'm run")
    }

    fun getFullname(): String{
        return "$firstName $middleName $lastName"
    }
}