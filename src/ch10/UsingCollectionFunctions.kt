package ch10

fun main(args : Array<String>) {
    val names = listOf("이황", "김철수", "신사임당", "이영희", "길동", "김영수")

    // 1. 각 이름의 길이를 담은 리스트를 생성하세요.
    val lengthList = mutableListOf<Int>();
    for(name in names) lengthList.add(name.length)
    println("1. $lengthList")

    // 2. 성이 김씨인 사람만 담은 리스트를 생성하세요.
    val KimList = names.filter { it.startsWith("김") }
    println("2. $KimList")

    // 3. 이름이 두 글자인 사람만 담은 리스트를 생성하세요.
    val TwoLengthList = names.filter { it.length == 2 }
    println("3. $TwoLengthList")

    // 4. 이름이 세 글자인 사람의 수를 구하세요.
    val ThreeLengthCount = names.count { it.length == 3 }
    println("4. $ThreeLengthCount")
}