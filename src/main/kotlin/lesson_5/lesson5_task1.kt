package org.example.lesson_5

fun main() {
    val num1 = 5
    val num2 = 7
    val sum = num1 + num2

    println("Докажите, что вы не робот. Сколько будет $num1+$num2?")
    val input: Int? = readlnOrNull()?.toInt()
    if (input == sum) println("Добро пожаловать!")
    else println("Доступ запрещен.")
}