package org.example.lesson_3

fun main() {

    var lastName = "Андреева"
    var name = "Татьяна"
    var patronymic = "Сергеевна"
    var age = 20

    println("ФИО: $lastName $name $patronymic, $age")
    age = 22
    lastName = "Сидорова"
    println("ФИО: $lastName $name $patronymic, $age")

}