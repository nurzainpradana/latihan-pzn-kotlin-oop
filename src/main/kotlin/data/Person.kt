package data

class Person{
    var firstName: String = ""
    //val firstName: String = "" //
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String): Unit{
        println("Hello $name, my name is $firstName")
    }

    fun sayHello(name: Int): Unit{
        println("Hello $name, my name is $firstName")
    }

    fun sayHello(firstNameParam: String, lastNameParam: String): Unit{
        println("Hello $firstNameParam, my name is $lastNameParam")
    }

    fun run(){
        println("I'm run")
    }

    fun getFullname(): String{
        return "$firstName $middleName $lastName"
    }
}