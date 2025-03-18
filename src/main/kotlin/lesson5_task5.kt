package org.example

import kotlin.random.Random

fun main() {

    val num1 = Random.nextInt(0, 43)
    val num2 = Random.nextInt(0, 43)
    val num3 = Random.nextInt(0, 43)
    val winNumbers = setOf(num1, num2, num3) //в идеале нужно исключить возможность повтора чисел условиями или поменять на массив

    println("Введите первое число от 0 до 42")
    val input1 = readln().toInt()
    println("Введите второе число от 0 до 42")
    val input2 = readln().toInt()
    println("Введите третье число от 0 до 42")
    val input3 = readln().toInt()
    val inputNumbers = setOf(input1, input2, input3)
    val guessedNumbers = inputNumbers.intersect(winNumbers)

    when (guessedNumbers.size) {
        3 -> println("Вы угадали все три числа и выиграли джекпот!")
        2 -> println("Вы угадали 2 числа и выиграли крупный приз!")
        1 -> println("Вы угадали 1 число и выиграли утешительный приз!")
        else -> println("Неудача")
    }
    println("Загаданными числами являлись: $winNumbers")
}