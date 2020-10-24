package data

class Car(paramBrand: String, paramName: String, paramYear: Int) {

    // println("Car Dibuat") //ERROR
    init {
        println("Car $paramBrand dibuat")
    }

    constructor(paramBrand: String, paramName: String) :
            this(paramBrand, paramName, 2020){
        println("Secondary Constructor")
    }

    constructor(paramBrand: String) :
            this(paramBrand, ""){
        println("Secondary Contructor 2")
    }

    var brand: String = paramBrand
    var name: String = paramName
    var year: Int = paramYear
}