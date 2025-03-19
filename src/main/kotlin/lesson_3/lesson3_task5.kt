package org.example.lesson_3

fun main() {

    val move = "D2:D4;0"
    val moveParams = move.split(":", ";")
    val from = moveParams[0]
    val to = moveParams[1]
    val moveCount = moveParams[2]

    println("Откуда: $from Куда: $to Номер хода: $moveCount")

}
