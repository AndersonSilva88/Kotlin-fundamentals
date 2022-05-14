package com.anderson.basics

fun main() {
    var x = 0

    while (x < 10) {
        println("X = $x")
        x += 3
    }

    println()

    do {
        println("X = $x")
        x -= 3
    } while (x > 0)

    for (item in 1..10){
        print("$item, ")
    }

    println()

    for (ch in "Anderson") {
        print(ch)
    }

}