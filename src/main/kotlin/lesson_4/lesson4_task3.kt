package org.example.lesson_4

fun main() {

    val isWeatherSunny = true
    val isTentOpen = true
    val airHumidity = 20
    val season = "winter"
    val isGoodForBeans: Boolean = isWeatherSunny && isTentOpen && airHumidity == 20 && season.equals("winter", ignoreCase = true)

    println("Благоприятные ли условия сейчас для роста бобовых? $isGoodForBeans")

}