package org.example.lesson_4

fun main() {

    println("Есть ли повреждения у корабля? Введите true или false")
    var input = readLine()
    val shipHaveDamages: Boolean? = input.toBoolean()

    println("Количество членов экипажа на борту?")
    input = readLine()
    val crewTotal = input?.toIntOrNull()

    println("Количество ящиков провизии на борту?")
    input = readLine()
    val provisionBoxes = input?.toIntOrNull()

    println("Погода благоприятная? Введите true или false")
    input = readLine()
    val isWeatherSuitable: Boolean = input.toBoolean()

    val shipCanDepart = (!shipHaveDamages!! && crewTotal!! in 55..70 && provisionBoxes in 55..70) ||
            (shipHaveDamages!! && crewTotal == 70 && provisionBoxes!! >= 50 && isWeatherSuitable==true)

    println("Корабль может отплыть: $shipCanDepart")

}