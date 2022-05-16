package com.anderson.functionalProgramming

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ada", 15),
        Student("Manuel", 20),
        Student("Maria", 25),
        Student("Joao", 45),
        Student("Jose", 21)

    )
}
