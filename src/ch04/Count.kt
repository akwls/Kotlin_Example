package ch04

fun main(args : Array<String>) {
    print("숫자 입력 : ");
    var num = readLine()!!.toInt();

    if(num >= 1) {
        for(i in num downTo 1) {
            print(i.toString() +" ")
        }
        println("출발!")
    }
}