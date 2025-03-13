package org.example.lesson_2

fun main() {

    val marks = listOf(3, 4, 3, 5)
    val sum = marks.sum()
    val averageMark = sum / marks.size.toDouble()
    println("Средний балл: $averageMark")

}