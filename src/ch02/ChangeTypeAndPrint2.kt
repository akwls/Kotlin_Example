package ch02

fun main(args : Array<String>) {
    var a: Int = 1;
    var b: Double = 2.5;

    b = b.toDouble();
    println("${a+b}") // 문자열 템플릿
}