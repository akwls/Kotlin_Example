package ch05

fun excludeChar(str: String, arr : Array<Char>) : String {
    var result = ""

    for(c in str) {
        if(!(c in arr)) {
            result += c
        }
    }

    return result
}

fun main(args : Array<String>) {
    var str1 = excludeChar("Hello", arrayOf('H', 'l'))
    println(str1)

    var str2 = excludeChar("Hello World", arrayOf('H', 'W', 'o'))
    println(str2)
}