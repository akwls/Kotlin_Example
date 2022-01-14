package ch07

import kotlin.math.*

fun String.countSpace() : Int {
    var count = 0
    for(str in this) {
        if(str == ' ') count++
    }
    return count
}

fun Double.toPair() : Pair<Int, Double> {
    return floor(this).toInt() to this-floor(this)
}

fun main(args : Array<String>) {
    println("Hello World".countSpace())
    println("Hello W o r l d Kotlin".countSpace())

    var d1 = 1.5
    var d2 = 3.14159
    println(d1.toPair())
    println(d2.toPair())
}