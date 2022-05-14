package com.anderson.orientationObject.objects

fun main() {

    val location1 = object {
        var xCoordinate = 200
        var yCoordinate = 400
    }

    println("Coordinates = (${location1.xCoordinate}, ${location1.yCoordinate})")

    val location2 = object {
        var xCoordinate = 300
        var yCoordinate = 600

        fun printIt() {
            println("Coordinates = ($xCoordinate, $yCoordinate)")
        }
    }
    location2.printIt()

    location2.xCoordinate = 3000
    location2.yCoordinate = 6000

    location2.printIt()

    val temperature = MYSingleton.getLastTemperature()
    println("Last temperature mesured = $temperature degress!")
}

object MYSingleton{
    var temperatures = arrayOf(18, 22, 26, 36)
    fun getLastTemperature() = temperatures.last()
}