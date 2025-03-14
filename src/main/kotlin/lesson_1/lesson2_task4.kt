package org.example.lesson_1

fun main() {

    var crystalOre = 7
    var metalOre = 11
    val buff = 20

    println(
        """
        Количество бонусной кристаллической руды: ${(buff * crystalOre) / 100}
        Количество бонусной железной руды: ${(buff * metalOre) / 100}
    """.trimIndent()
    )
}