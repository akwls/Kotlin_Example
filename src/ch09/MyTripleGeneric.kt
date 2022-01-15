package ch09

class MyTriple<T, K, V>(var first: T, var second: K, var third: V) {}

fun main(args: Array<String>) {
    val triple = MyTriple(1, 2.0, "Hello")
    println(triple)
}