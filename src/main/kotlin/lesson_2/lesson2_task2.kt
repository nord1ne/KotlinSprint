package org.example.lesson_2

fun main() {
    var numberOfExperincedStuff = 50
    var numberOfNewbies = 30
    var wageRateOfExperincedStuff = 30000
    var wageRateOfNewbie = 20000

    var MonthlyWageOfExeriencedStaff = numberOfExperincedStuff * wageRateOfExperincedStuff
    var TotalMontlyWage = MonthlyWageOfExeriencedStaff + numberOfNewbies * wageRateOfNewbie
    var averageWage = TotalMontlyWage / (numberOfExperincedStuff + numberOfNewbies)
    //везде var, потому что и зп и число сотрудников может меняться

    println(
        """
        Количество постоянных сотрудников: $numberOfExperincedStuff
        Количество стажеров: $numberOfNewbies
        Ставка для постоянных сотрудников: $wageRateOfExperincedStuff
        Ставка для новичков: $wageRateOfNewbie
        Общая з\п постоянных сотрудников: $MonthlyWageOfExeriencedStaff
        Общий ФОТ: $TotalMontlyWage
        Средняя зарплата по компании: $averageWage
        
    """.trimIndent()
    )
}