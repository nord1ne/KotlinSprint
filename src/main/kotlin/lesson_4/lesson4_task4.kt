package org.example.lesson_4

fun main() {

    var day = 5
    var canTrainHands = if (day % 2 == 1) true else false
    var canTrainBelly = if (day % 2 == 1) true else false
    var canTrainBack = if (day % 2 == 0) true else false
    var canTrainLegs = if (day % 2 == 0) true else false

    println(
        """
        Упражнения для рук:     $canTrainHands
        Упражнения для ног:     $canTrainLegs
        Упражнения для спины:   $canTrainBack
        Упражнения для пресса:  $canTrainBelly
    """.trimIndent()
    )
}