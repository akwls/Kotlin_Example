package ch04

fun main(args : Array<String>) {
    val countris = arrayOf("한국", "미국", "일본", "중국", "러시아")
    val cities = arrayOf("서울", "워싱턴", "도쿄", "베이징", "모스크바")

    val selectedIdx = kotlin.random.Random.nextInt(5)

    print(countris[selectedIdx] + "의 수도는? ")
    var answer:String? = readLine()!!;

    if(answer != null) {
        if(answer.trim() == cities[selectedIdx]) {
            println("정답입니다.")
        }
        else {
            print("오답입니다.")
            println("(정답 : " + cities[selectedIdx] + ")")
        }
    }
}