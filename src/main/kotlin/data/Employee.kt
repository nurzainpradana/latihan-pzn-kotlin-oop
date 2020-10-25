package data

open class Employee(val name: String) {
    open fun sayHello(name: String){
        println("Hello, my name is ${this.name}")
    }
}

open class Manager(name: String): Employee(name) {
    final override fun sayHello(name: String) {
        println("Hello, my name is Manager ${this.name}")
    }
}

class SuperManager(name: String) : Manager(name) {
    /* override fun sayHello(name: String) {
        println("Hello, my name is Super Manager ${this.name}")
    }

    ERROR Karena function pada manager bersifat final
     */
}

class VicePresident(name: String): Employee(name) {
    override fun sayHello(name: String) {
        println("Hello, my name is Vice Manager ${this.name}")
    }
}