package com.anderson.advancesfeatures

fun main() {

    showcomponents()

    return

    val c1= Coordinates(200, 100)
    val c2 = Coordinates(1000, 2000)
    val c3 = c1 + c2

    println(c3)

    val (xCoordinate, yCoordinate) = c3

    //println("xCoordinate = $xCoordinate, yCoordinate = $yCoordinate")
    println("xCoordinate = ${c3.component1()}")

}

fun showcomponents() {
    val myPoint = Point(5000, 500, 6000)
    val (myX, myY, myZ) = myPoint
    println("myX = $myX, myY = $myY, myZ = $myZ")
}