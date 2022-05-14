package com.anderson.orientationObject.interfaces

interface Vehicle {

    val automakerName: String

    fun start() {
        println("Vruuuunnnnn")
    }

    fun stop() {
        println("Brake noise")
    }
    fun getKmPerliter(): Int {
        return 17
    }

    fun getDoors(): Int
}