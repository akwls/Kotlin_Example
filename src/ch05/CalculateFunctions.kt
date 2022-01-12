package ch05

fun calculateCircleArea(radius : Double) : Double {
    return radius * radius * Math.PI
}

fun calculateBMI(height: Double, weight: Double) : Double {
    var BMI = weight / (height * height)
    return BMI
}

fun main(args : Array<String>) {
    var area = calculateCircleArea(10.0)
    println(area)

    var bmi = calculateBMI(1.8, 80.0)
    println(bmi)
}