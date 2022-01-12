package ch05

fun filterCount(vararg nums: Int, func: (Int) -> Boolean) : Int {
    var cnt = 0
    for(n in nums) {
        if(func(n)) {
            cnt++
        }
    }
    return cnt
}

fun main(args : Array<String>) {
    var count1 = filterCount(1,2,3,4,5) {
        (it % 2) == 0
    }
    println(count1)

    var count2 = filterCount(1,2,3,4,5,6) {
        it >= 3
    }
    println(count2)
}