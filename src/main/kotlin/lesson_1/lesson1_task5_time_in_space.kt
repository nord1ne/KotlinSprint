package org.example.lesson_1

const val MINUTES_IN_HOUR = 60
const val SECONDS_IN_HOUR = 3600

fun main() {
    val totalSecondsInSpace = 6480
    val hoursInSpace = totalSecondsInSpace / SECONDS_IN_HOUR
    val minutesInSpace = totalSecondsInSpace / MINUTES_IN_HOUR - hoursInSpace * MINUTES_IN_HOUR
    val secondsInSpace = totalSecondsInSpace % (totalSecondsInSpace / MINUTES_IN_HOUR)

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpace, secondsInSpace))

}


