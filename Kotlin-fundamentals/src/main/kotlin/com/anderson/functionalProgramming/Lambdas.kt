package com.anderson.functionalProgramming


fun main() {
    val students = getStudents()

    val combos = students.map { a -> "${a.name} : ${a.age}" }
    println("Combos: $combos")

    println("The oldest student is: ${students.maxByOrNull { it.age }}")

    println("The with logest name is: ${students.filter { it.name.length > 5 }}")


}