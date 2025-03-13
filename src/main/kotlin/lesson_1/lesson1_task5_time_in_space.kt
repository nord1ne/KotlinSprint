package org.example.lesson_1

fun main() {
    val totalSecondsInSpace = 6480
    val secondsInHour = 3600
    val minutesInHour = 60
    val hoursInSpace = totalSecondsInSpace / secondsInHour

    val minutesInSpace = totalSecondsInSpace / minutesInHour - hoursInSpace * minutesInHour
    val secondsInSpace = totalSecondsInSpace % (totalSecondsInSpace / minutesInHour)

    println("${String.format("%02d", hoursInSpace)}:${String.format("%02d",minutesInSpace)}:${String.format("%02d", secondsInSpace)}")

}

