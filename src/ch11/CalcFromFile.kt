package ch11

import java.io.File

fun main(args: Array<String>) {
    val calcFile = File("src/ch11/calc.txt")
    var contents = calcFile.readLines()

    var num1 = contents[1].toDouble()
    var num2 = contents[2].toDouble()
    var result = when(contents[0]) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> num1 / num2
        else -> "잘못된 연산자입니다."
    }
    println(result)
}