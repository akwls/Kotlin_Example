package ch04

fun main(args : Array<String>) {
    print("검사할 수 입력 : ");
    var num = readLine()!!.toInt();

    var result = true;
    if(num >= 3) {
        for (i in 2 until num) {
            if (num % i == 0) {
                result = false;
                break;
            }
        }
    }

    println("${num}는 소수? $result");
}