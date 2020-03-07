package models

object Game {
    var turn = -1

    var round = -1

    @ServerOnly
    val jack: Character
        get() = throw ExceptionInInitializerError()

    var turnAvailableCharacters = listOf<Character>()

    val visibleCharacters: MutableList<Character> = mutableListOf()
    val invisibleCharacters: MutableList<Character> = mutableListOf()

    enum class JackStatus {
        Visible, Invisible
    }

    var jackStatus = JackStatus.Visible
}