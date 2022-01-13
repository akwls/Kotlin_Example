package ch06

interface Shape {
    val area: Double
    val perimeter: Double
}

class Rectangle(var width: Double, var height: Double) : Shape {
    override val area: Double
        get() = width * height
    override val perimeter: Double
        get() = (width + height) * 2
}

class Circle(var radius: Double) : Shape {
    override val area: Double
        get() = radius * radius * Math.PI
    override val perimeter: Double
        get() = radius * 2 * Math.PI
}

fun main(args : Array<String>) {
    var r = Rectangle(10.0, 20.0)
    println(r.area)
    println(r.perimeter)

    var c = Circle(10.0)
    println(c.area)
    println(c.perimeter)
}