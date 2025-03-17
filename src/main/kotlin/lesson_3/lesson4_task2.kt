package org.example.lesson_3

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_VOLUME = 100

fun main() {

    var isCategoryAverage: Boolean
    var cargoWeight = 20
    var cargoVolume = 80
    isCategoryAverage = cargoWeight > MIN_WEIGHT && cargoWeight <= MAX_WEIGHT && cargoVolume < MAX_VOLUME

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': $isCategoryAverage")

    cargoWeight = 50
    cargoVolume = 100
    isCategoryAverage = cargoWeight > MIN_WEIGHT && cargoWeight <= MAX_WEIGHT && cargoVolume < MAX_VOLUME

    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average': $isCategoryAverage")

}