package com.anderson.advancesfeatures

//class Person constructor(firstName: String, lastName: String) {}
//class Person (firstName: String, lastName: String) {

@Deprecated("use the Animal class instead ", ReplaceWith("Animal"))
class Person internal constructor (firstName: String, lastName: String) {

    init {
        println("Create a person named $firstName $lastName")
    }

    constructor(firstName: String, lastName: String, middleName: String):
        this(firstName, lastName)

}