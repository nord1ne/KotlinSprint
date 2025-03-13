package org.example.lesson_1

fun main() {
    val secondsInSpace = 6488
    val hoursInSpace = secondsInSpace / 3600
    val minutesRemaining = secondsInSpace / 60 - hoursInSpace * 60
    val secondsRemaining = secondsInSpace % (secondsInSpace / 60)

    print("Время нахождения Юрия Гагарина в космосе: ")
    timeBuilder(hoursInSpace, minutesRemaining, secondsRemaining)/*
    почему-то если пихнуть метод прямо в принт ${}, то почему-то сначала печатается результат выполнения метода,
    а потом текст
     */
}

fun timeBuilder(hour: Int, minute: Int, second: Int) {
    println("${timeFormat(hour)}:${timeFormat(minute)}:${timeFormat(second)}")
//вспомогательный метод, чтобы распечатать красиво время и не громоздить в мэйне

}


fun timeFormat(num: Int): String {
    return if (num / 10 == 0) "0$num"
    else num.toString()/*возвращает часы\минуты\секунды в виде строки и добавляет "0" впереди, если переданное число имеет 1 символ
    работает только в рамках задачи, чтобы не получать деление на ноль, нужно допилить условия
    */
} 