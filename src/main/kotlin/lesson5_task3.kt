package org.example

fun main() {
    val winNumbers = setOf(13, 34)
    println("Введите первое число от 0 до 42")
    val input1 = readln().toInt()
    println("Введите второе число от 0 до 42")
    val input2 = readln().toInt()

    val isOneGuessed = winNumbers.contains(input1) || winNumbers.contains(input2)
    val isBothGuessed = winNumbers.contains(input1) && winNumbers.contains(input2)

    if (input1 in 0..42 && input2 in 0..42) {
        if (isOneGuessed) println("Вы выиграли утешительный приз!")
        else if (isBothGuessed) println("Поздравляем! Вы выиграли главный приз!")
        else println("Неудача!")
    } else println("Ошибка! Одно или оба введенных числа вне диапазона от 0 до 42. Попробуйте еще раз!")
}