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

    fun sayHello(firstName: String, lastName: String): Unit{
        println("Hello $firstName $lastName, my name is $lastName")
        println("Hello ${this.firstName} ${this.lastName}, my name is ${this.lastName}")
    }

    fun run(){
        println("I'm run")
    }

    fun getFullname(): String{
        return "$firstName $middleName $lastName"
    }
}