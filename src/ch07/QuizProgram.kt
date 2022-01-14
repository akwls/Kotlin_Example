package ch07

sealed class Quiz(val question: String)

enum class AnswerType { O, X }

class OXQuiz(question: String, val answer: AnswerType) : Quiz(question)

class MultiChoiceQuiz(question: String, val answer: String, val choices: List<String>) : Quiz(question)

class ShortAnswerQuiz(question: String, val answer: String, val alternatives:
    List<String>?, val sanitize: (String) -> String = { it.trim() }) : Quiz(question)

fun main(args : Array<String>) {
    val quizzes = mutableListOf<Quiz>()

    var rightCount = 0

    quizzes.add(OXQuiz("대한민국의 수도는 서울이다", AnswerType.O))
    quizzes.add(OXQuiz("미국의 수도는 뉴욕이다.", AnswerType.X))
    quizzes.add(MultiChoiceQuiz("대한민국의 수도는?", "서울", listOf("서울", "대전", "대구", "부산")))
    quizzes.add(ShortAnswerQuiz("사과를 뜻하는 영단어는?", "apple", null) {it.trim().toLowerCase()})
    quizzes.add(ShortAnswerQuiz("JetBrains사에서 만든 JVM 기반 프로그래밍 언어는?", "Kotlin", listOf("코틀린", "kotlin")))

    for(q in quizzes) {
        var question = q.question
        println("${quizzes.indexOf(q)+1}. $question")
        var answer: String? = null

        var type = when(q) {
            is OXQuiz -> {
                print("> ")
                answer = readLine()
                var answerType: AnswerType? = when(answer?.uppercase()) {
                    "O" -> AnswerType.O
                    "X" -> AnswerType.X
                    else -> null
                }
                if(q.answer == answerType) {
                    println("정답입니다.")
                    rightCount++
                }
                else {
                    println("오답입니다.")
                }
            }
            is MultiChoiceQuiz -> {
                for(choice in q.choices) {
                    println("${q.choices.indexOf(choice)+1}. $choice")
                }
                print("> ")
                answer = readLine()
                if(answer?.toInt() == q.choices.indexOf(q.answer)+1) {
                    println("정답입니다.")
                    rightCount++
                }
                else {
                    println("오답입니다. (정답: ${q.answer})")
                }
            }
            is ShortAnswerQuiz -> {
                print("> ")
                answer = readLine()
                if(answer == q.answer || (q.alternatives != null && answer in q.alternatives)) {
                    println("정답입니다.")
                    rightCount++
                }
                else {
                    println("오답입니다. (정답: ${q.answer}")
                }
            }
        }
        println()
    }

    println("맞은 개수 : $rightCount / 총 문제 개수 : ${quizzes.size}")
}