package org.example.lesson_4

const val TABLES_QUANTITY = 13

fun main() {

    val todayReserve = 13
    val tomorrowReserve = 9

    println("Доступность столиков на сегодня: ${todayReserve < TABLES_QUANTITY}\nДоступонсть столиков на завтра: ${tomorrowReserve < TABLES_QUANTITY}")
}