package org.example.lesson_3

var moveCounter = 0

fun main() {
    var from = "E2"
    var to = "E4"
    makeMove(from, to)

    from = "D2"
    to = "D3"
    makeMove(from, to)
}

fun makeMove(from: String, to: String) {
    println("$from-$to:${++moveCounter}")
}