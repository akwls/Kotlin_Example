package ch07

import java.time.LocalDateTime
import java.time.Month

data class Movie(var title: String, var genre: String, var rating: Double)

data class TwitterMessage(
    var name:String,
    var Id: String,
    var datetime: LocalDateTime,
    var message: String,
    var reply: Int,
    var retweet: Int,
    var likes: Int
    )

fun main(args : Array<String>) {
    var movie = Movie("겨울왕국", "Animation", 9.0)
    println(movie)

    var twitterMessage = TwitterMessage("프로그래밍 책 인용 봇",
        "book_quote_bot",
        LocalDateTime.of(2022, Month.MAY, 28, 21, 59, 0),
        "우리가 단지 돌을 자를지라도 언제나 대성당을 마음속에 그러야 한다." +
                " - 채석장 일꾼의 신조(실용주의 프로그래머)",
        0, 1, 2
    )
    println(twitterMessage)
}