package org.example

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    val currentYear = LocalDate.now().year
    println("Для доступа к материалам введите год своего рождения")
    val birthYear: Int = readln().toInt()

    if ((currentYear - birthYear) >= AGE_OF_MAJORITY)
        println("Показать экран со скрытым контентом")
    else println("Доступ к контенту запрещен")
}