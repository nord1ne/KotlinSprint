package org.example.lesson_3

fun main() {

    val MinWeight = 35
    val MaxWeight = 100
    val MaxVolume = 100
    var categoryAverage = false

    var cargoWeight = 20
    var cargoVolume = 80

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': ${categoryAverage == cargoWeight >= MinWeight && cargoWeight < MaxWeight && cargoVolume < MaxVolume}")

    cargoWeight = 50
    cargoVolume = 100

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': ${categoryAverage == cargoWeight >= MinWeight && cargoWeight < MaxWeight && cargoVolume < MaxVolume}")
}