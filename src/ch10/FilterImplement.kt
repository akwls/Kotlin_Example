package ch10

fun <E> List<E>.myFilter(func :(E) -> Boolean ) : List<E>{
    val resultList = mutableListOf<E>()
    this.forEach() {
        if(func(it)) resultList.add(it)
    }
    return resultList
}

fun main(args: Array<String>) {
    val result1 = listOf("Hello", "Banana", "World", "Hole").myFilter {
        it.length == 5 || it.startsWith("H")
    }
    println(result1)
    val result2 = listOf(1,2,3,4,5,6).myFilter {
        it % 2 == 0
    }
    println(result2)
}