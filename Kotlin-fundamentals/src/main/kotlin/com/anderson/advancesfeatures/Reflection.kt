package com.anderson.advancesfeatures

fun main() {

    val person = Person("Stam", "Lee")

    val KClass = person::class

    //println("Simple name = $KClass")
    println("Simple name = ${KClass.simpleName}")

    for (fields in KClass.java.declaredFields) {
        println("Property name = ${fields.name}")
    }

}