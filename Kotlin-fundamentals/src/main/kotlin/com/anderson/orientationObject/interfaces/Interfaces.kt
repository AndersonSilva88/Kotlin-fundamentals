package com.anderson.orientationObject

import com.anderson.orientationObject.interfaces.Car

fun main() {

    val myCar = Car()
    myCar.start()
    println("My car`s make = ${myCar.automakerName}")

}