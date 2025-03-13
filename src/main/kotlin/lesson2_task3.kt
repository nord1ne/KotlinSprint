package org.example

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val travelTime = 457 //количество минут в пути

    val arriveHour = timeFormat(departureHour + travelTime % departureHour)
    val arriveMinute = timeFormat(travelTime % 60)
    println("$arriveHour:$arriveMinute")

}

fun timeFormat(time: Int): String {
    return if (time / 10 == 0)
        "0$time"
    else "$time"
}