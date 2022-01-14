package ch07

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

fun doCalculation(calculable: Calculable, x: Double, y: Double) : Double {
    return calculable.calculate(x, y)
}

fun main(args : Array<String>) {
    var add = Add()
    var sub = Subtract()

    var res1 = doCalculation(add, 3.0, 4.0)
    var res2 = doCalculation(sub, 10.0, 4.0)

    println(res1)
    println(res2)

    val mul = object : Calculable {
        override fun calculate(x: Double, y: Double): Double {
            return x * y
        }
    }

    val div = object : Calculable {
        override fun calculate(x: Double, y: Double): Double {
            return x / y
        }
    }

    var res3 = doCalculation(mul, 3.0, 4.0)
    var res4 = doCalculation(div, 10.0, 4.0)
    println(res3)
    println(res4)
}
