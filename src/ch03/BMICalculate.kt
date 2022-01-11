package ch03

fun main(args : Array<String>) {
    var height:Double = 1.8;
    var weight:Int = 80;

    val BMI = weight / (height * height)
    println(BMI);
}