package org.example

import kotlin.math.pow

fun main() {
    val deposit = 70000
    val procentRate = 0.167
    val term = 20
    val resultDeposit = deposit * (1 + procentRate).pow(term)
    val formattedResultDeposit = "%.3f".format(resultDeposit)

    println("Сумма вклада в конце срока: $formattedResultDeposit")

}