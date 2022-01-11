package ch04

fun main(args : Array<String>) {
    // step 함수 이용
    for(i in 1..5 step 2) {
        for(j in 1 ..i) {
            print("*")
        }
        println()
    }

    println()

    // continue 이용
    for(i in 1..5) {
        if(i%2 == 0) continue;
        for(j in 1 ..i) {
            print("*")
        }
        println()
    }
}