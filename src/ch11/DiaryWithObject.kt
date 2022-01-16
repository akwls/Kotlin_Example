package ch11

import java.io.File
import java.io.FileOutputStream
import java.io.ObjectOutputStream
import java.io.Serializable
import java.time.LocalDate

data class Diary(var content: String): Serializable

fun main(args: Array<String>) {
    var today = LocalDate.now()
    var fileName = "diary_${today.year}-${today.monthValue}-${today.dayOfMonth}.bin"

    var todayDiary = ObjectOutputStream(FileOutputStream("src/ch11/${fileName}"))

    var input: String? = ""
    var content = ""

    while(true) {
        print("> ")
        input = readLine()
        if(input == "/quit") {
            todayDiary.writeObject(Diary(content))
            todayDiary.flush()
            todayDiary.close()
            break
        }
        if(input == "/clear") {
            content = ""
            continue
        }
        content += "$input\n"
        println("\"$input\" 입력 완료.")
    }


}