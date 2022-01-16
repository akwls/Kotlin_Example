package ch11

import java.io.File
import java.time.LocalDate

fun main(args: Array<String>) {
    var today = LocalDate.now()
    var fileName = "diary_${today.year}-${today.monthValue}-${today.dayOfMonth}.txt"
    var todayDiary = File("src/ch11/${fileName}")

    if(todayDiary.exists()) {
        println(todayDiary.readText())
    }
}