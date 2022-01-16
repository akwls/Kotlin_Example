package ch11

import java.io.File
import java.time.LocalDate

fun main(args: Array<String>) {
    var today = LocalDate.now()
    var fileName = "diary_${today.year}-${today.monthValue}-${today.dayOfMonth}.txt"

    var todayDiary = File("src/ch11/${fileName}")
    todayDiary.createNewFile()

    var input: String? = ""

    while(true) {
        print("> ")
        input = readLine()
        if(input == "/quit") {
            break;
        }
        if(input == "/clear") {
            todayDiary.writeText("")
            continue
        }
        todayDiary.appendText("${input.toString()}\n")
        println("\"$input\" 입력 완료.")
    }
    /*
    for(lines in todayDiary.readLines()) {
        println(lines)
    }
     */
}