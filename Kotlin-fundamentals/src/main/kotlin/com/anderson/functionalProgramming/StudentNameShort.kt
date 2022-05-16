package com.anderson.functionalProgramming

data class StudentNameShort( val name: String, var age: Int)

fun findTheShortestStudentName(students: List<Student>): Student? {
    return students.minByOrNull { it.name.length }
}
