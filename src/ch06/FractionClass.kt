package ch06

class Fraction(var numerator:Int, var denominator : Int) {
    fun toDouble() : Double{
        return numerator.toDouble() / denominator
    }
    private fun lcm(a: Int, b: Int) : Int {
        return (a * b) / gcd(a, b)
    }
    private fun gcd(a: Int, b:Int) : Int {
        var gcd = 1
        for(i in 2..kotlin.math.min(a, b)) {
            if(a % i == 0 && b % i == 0) {
                gcd = i
            }
        }
        return gcd
    }
    fun add(other: Fraction) : Fraction {
        var lcm = lcm(denominator, other.denominator) // 최소공배수
        var newNumerator = numerator * (lcm / denominator)  + other.numerator * (lcm / other.denominator)
        return Fraction(newNumerator, lcm)
    }
    fun sub(other: Fraction) : Fraction {
        var lcm = lcm(denominator, other.denominator) // 최소공배수
        var newNumerator = numerator * (lcm / denominator) - other.numerator * (lcm / other.denominator)
        return Fraction(newNumerator, lcm)
    }

    override fun toString(): String {
        return "$numerator/$denominator"
    }
 }

fun main(args : Array<String>) {
    var f1 = Fraction(3, 4)
    var f2 = Fraction(1, 10)

    println(f1.toDouble())

    var f3 = f1.add(f2)
    var f4 = f1.sub(f2)

    println(f3)
    println(f4)
}