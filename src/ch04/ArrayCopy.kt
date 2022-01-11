package ch04

fun main(args : Array<String>) {
    // 원본 배열 선언
    var original = arrayOf(1,2,3,4,5)
    // 값이 복사될 배열 선언
    var copy = Array(original.size){0}

    for(i in 0 until original.size) {
        copy[i] = original[i]
    }

    // 복사된 배열의 값 출력
    for(v in copy) {
        print("$v ")
    }
}