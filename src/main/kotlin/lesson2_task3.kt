package org.example

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457 //количество минут в пути

    val arriveHour = departureHour + travelTime % departureHour
    val arriveMinute = travelTime % 60
    println("${String.format("%2d", arriveHour)}:${String.format("%2d", arriveMinute)}")

}

