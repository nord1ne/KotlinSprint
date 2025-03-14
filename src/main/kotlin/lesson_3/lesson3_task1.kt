package org.example.lesson_3

fun main() {
    var userName = "Василий"
    val dayGreeting = "добрый день!"
    val nightGreeting = "добрый вечер!"

    var enterGreeting = "$userName, $dayGreeting"
    println(enterGreeting)

    enterGreeting = "$userName, $nightGreeting"
    println(enterGreeting)

}