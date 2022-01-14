package ch07

enum class CardSuit {
    SPADE, DIAMOND, HEART, CLUB
}

class Card(var shape: CardSuit, var number: Int) {
    override fun toString(): String {
        return "$shape ${
            when(number) {
                1 -> "Ace"
                11 -> "Jack"
                12 -> "Queen"
                13 -> "King"
                else -> number
            }
        }"
    }
}

fun main(args : Array<String>) {
    // 숫자를 그대로 출력
    var card2 = Card(CardSuit.DIAMOND, 2)
    var card3 = Card(CardSuit.HEART, 3)
    var card4 = Card(CardSuit.CLUB, 4)

    // 숫자에 대응하는 문자열로 변환해서 출력
    var card1 = Card(CardSuit.SPADE, 1)
    var card11 = Card(CardSuit.DIAMOND, 11)
    var card12 = Card(CardSuit.HEART, 12)
    var card13 = Card(CardSuit.CLUB, 13)

    println(card2)
    println(card3)
    println(card4)
    println(card1)
    println(card11)
    println(card12)
    println(card13)

}