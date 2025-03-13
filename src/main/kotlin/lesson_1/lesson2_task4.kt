package org.example.lesson_1

fun main() {

    var crystalOre = 7
    var metalOre = 11
    val buff = 0.2

    println(
        """
        Количество бонусной кристаллической руды: ${(crystalOre * buff).toInt()}
        Количество бонусной железной руды: ${(metalOre * buff).toInt()}
    """.trimIndent()
    )
}