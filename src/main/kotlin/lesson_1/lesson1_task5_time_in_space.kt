package org.example.lesson_1

fun main() {
    val totalSecondsInSpace = 6480
    val secondsInHour = 3600
    val minutesInHour = 60
    val hoursInSpace = totalSecondsInSpace / secondsInHour

    val minutesInSpace = totalSecondsInSpace / minutesInHour - hoursInSpace * minutesInHour
    val secondsInSpace = totalSecondsInSpace % (totalSecondsInSpace / minutesInHour)

    println(String.format("%02d:%02d:%02d", hoursInSpace, minutesInSpace, secondsInSpace))

}

