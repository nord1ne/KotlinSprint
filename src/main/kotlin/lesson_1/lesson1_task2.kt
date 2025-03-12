package org.example.lesson_1

fun main(){
    var ordersQuantity: Int = 75
    val thanksForOrderMessage: String = "Спасибо за заказ!"
    var staffQuantity: Int = 2000

    println("Количество заказов: $ordersQuantity \nСообщение о покупке: $thanksForOrderMessage")
//  println("Количество работников: $staffQuantity")
    staffQuantity--
    println("Количество работников: $staffQuantity")
}