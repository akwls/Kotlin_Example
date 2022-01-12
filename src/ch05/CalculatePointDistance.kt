package ch05

fun calculateDistance(x1:Double, y1:Double, x2:Double, y2:Double) : Double{
    return Math.sqrt(Math.pow(x2-x1,2.0) + Math.pow(y2-y1,2.0))
}

fun main(args : Array<String>) {
    val distance = calculateDistance(0.0, 0.0, 5.0, 5.0)
    println(distance)
}