package ch04

fun main(args : Array<String>) {
    val nums = arrayOf(7,5,7,8,9,9,1,2,3)
    var largest = nums[0]

    for(i in nums) {
        if(i > largest) {
            largest = i
        }
    }

    println(largest)
}