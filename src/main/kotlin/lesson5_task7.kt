package org.example

fun main() {

    println("Введите расстояние")
    val distance: Double = readln().toDouble()
    println("Укажите расход на 100км")
    val consumptionPer100km: Double = readln().toDouble()
    println("Введите цену за литр топлива")
    val pricePerLiter: Double = readln().toDouble()

    val fuelNeeded = distance*consumptionPer100km/100
    val priceOfRide = fuelNeeded * pricePerLiter

    println("""
        Требуется топлива: ${String.format("%.2f", fuelNeeded)}л.
        Стоимость поездки: ${String.format("%.2f", priceOfRide)}р.
    """.trimIndent()
    )
}