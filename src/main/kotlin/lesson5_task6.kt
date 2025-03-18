package org.example

import kotlin.math.pow

const val CM_IN_METER = 100
const val LOW_MASS: Double = 18.5
const val NORMAL_MASS: Double = 25.0
const val OVER_MASS: Double = 30.0

fun main() {
    println("Введите свой рост")
    val height: Double = readln().toDouble() / CM_IN_METER
    println("Введите свой вес")
    val weight: Double = readln().toDouble()
    val bmIndex = weight / height.pow(2)

    if (bmIndex < LOW_MASS)
        println("ИМТ < $LOW_MASS: Недостаточная масса тела")
    else if (bmIndex >= LOW_MASS && bmIndex < NORMAL_MASS)
        println("$LOW_MASS <= ИМТ < $NORMAL_MASS: Нормальная масса тела")
    else if (bmIndex >= NORMAL_MASS && bmIndex < OVER_MASS)
        println("$NORMAL_MASS<= ИМТ < $OVER_MASS: Избыточная масса тела")
    else if (bmIndex > OVER_MASS)
        println("ИМТ > $OVER_MASS: Ожирение")

    println("Ваш ИМТ: ${String.format("%.2f", bmIndex)}")
}