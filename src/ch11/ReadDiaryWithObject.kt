package ch11

import java.io.*
import java.time.LocalDate

fun main(args: Array<String>) {
    var today = LocalDate.now()
    var fileName = "diary_${today.year}-${today.monthValue}-${today.dayOfMonth}.bin"

    var file = File("src/ch11/${fileName}")
    if(file.exists()) {
        var todayDiary = ObjectInputStream(FileInputStream(file))
        print((todayDiary.readObject() as Diary).content)
    }
}