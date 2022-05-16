package com.anderson.functionalProgramming

import org.funktionale.partials.partially1
import org.funktionale.partials.partially3

fun main() {

    val prefixAndPostFix: (String, String, String) -> String =
        {prefix: String, x: String, postfix: String
         -> "${prefix}${x}${postfix} "}

    val prefixAndAlert: (String, String) -> String = prefixAndPostFix.partially3("!")

    val hello: (String) -> String = prefixAndAlert.partially1("Hello, ")

    println(hello("FunkTionale"))
}