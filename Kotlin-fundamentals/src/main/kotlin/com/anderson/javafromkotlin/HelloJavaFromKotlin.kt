package com.anderson.javafromkotlin

import withJava.Animal

fun main() {
    val cat = Animal("Garfield", "cat", 10)
    println(cat.show())

    val dog = Animal("Willie", "dog", 40)
    println(dog.show())

    cat.weight = 13
    println(cat.show())


}