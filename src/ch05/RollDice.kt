package ch05

import kotlin.random.Random

// 함수 정의
/*
fun rollDice() : Int {
    return Random.nextInt(6) + 1
}
 */

// 함수 표현식
fun rollDice() = Random.nextInt(6) + 1

fun main(args : Array<String>) {
    var num = rollDice()
    println(num)
}