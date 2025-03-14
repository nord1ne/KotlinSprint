package org.example

fun main() {

    val departureHour = 9
    val departureMinute = 39
    val minutesInHour = 60
    val travelTimeMinutes = 457 //количество минут в пути

    val arriveHour = departureHour + (travelTimeMinutes / minutesInHour)
    val arriveMinute = (travelTimeMinutes + departureMinute) % minutesInHour
    println(String.format("%2d:%2d",arriveHour,arriveMinute))


}

