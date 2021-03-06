package ch06

import kotlin.math.pow
import kotlin.math.sqrt

class Point(
    val x: Double,
    val y: Double
    )
{
    fun calculateDistanceFrom(other: Point) : Double{
        var distance = sqrt((other.x - x).pow(2.0) + (other.y - y).pow(2.0))
        return distance
    }
    fun move(movePoint: Point) : Point {
        var newX = x + movePoint.x
        var newY = y + movePoint.y
        return Point(newX, newY)
    }
}

fun main(args : Array<String>) {
    val p1 = Point(0.0, 0.0)
    val p2 = Point(5.0, 5.0)

    println(p1.calculateDistanceFrom(p2))

    val p3 = Point(2.0, 1.0)
    val p4 = Point(4.0, 7.0)
    val p5 = p3.move(p4)
    println("${p5.x}, ${p5.y}")
}