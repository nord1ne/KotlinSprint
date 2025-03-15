package org.example

const val MINUTES_IN_HOUR = 60

fun main() {

    val departureHour = 9
    val departureMinute = 39

    val travelTimeMinutes = 457
    val arriveHour = departureHour + (travelTimeMinutes / MINUTES_IN_HOUR)
    val arriveMinute = (travelTimeMinutes + departureMinute) % MINUTES_IN_HOUR

    println(String.format("%2d:%2d", arriveHour, arriveMinute))

}

