package ch06

interface Calculable {
    fun calculate(a: Double, b: Double) : Double
}

class Add : Calculable {
    override fun calculate(a: Double, b: Double): Double {
        return a + b
    }
}

class Subtract : Calculable {
    override fun calculate(a: Double, b: Double): Double {
        return a - b
    }
}

fun doCalculation(calculable: Calculable, a: Double, b: Double) : Double {
    return calculable.calculate(a, b)
}

fun main(args : Array<String>) {
    var add = Add()
    var sub = Subtract()

    var res1 = doCalculation(add, 3.0, 4.0)
    var res2 = doCalculation(sub, 10.0, 4.0)

    println(res1)
    println(res2)
}