package ch08

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

class InvalidCardNumber(message: String="잘못된 카드 숫자입니다.(카드 숫자의 범위는 1이상 13이하)") : Exception(message) {

}

class CardWithException(var shape: CardSuit, var number: Int) {
    init {
        if(number < 1 || number > 13) {
            throw InvalidCardNumber()
        }
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

    // 예외 처리
    var invalid = CardWithException(CardSuit.SPADE, 100)

}