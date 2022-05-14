package com.anderson.basics

fun main() {

    val myInt = 199
    val aInt: Int = 7

    val lowaest = if ( myInt < aInt ) myInt else aInt

    val temp = 24
    val isAirConditionerOn = if (temp >= 26) {
        println("It is warm")
        true
    } else {
        println("It is not so warm")
        false
    }

    println("Is the air conditioner on: $isAirConditionerOn")
}