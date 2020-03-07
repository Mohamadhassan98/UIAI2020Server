package models

sealed class Cell(val position: Position, val adjacent: List<Cell> = listOf()) {

    var character: Character? = null
}

class StreetSpace(position: Position, adjacent: List<Cell>, val strictTile: Boolean = false) : Cell(position, adjacent) {
    var tile: Tile? = null

    companion object {
        val modelingStreetSpace: StreetSpace
            get() = throw IllegalAccessException("Not for production build")
    }
}

class QuaysideSpace private constructor(position: Position, adjacent: List<Cell>) : Cell(position, adjacent) {
    companion object {
        val quaysideSpace1: QuaysideSpace
            get() = throw ExceptionInInitializerError()
        val quaysideSpace2: QuaysideSpace
            get() = throw ExceptionInInitializerError()
        val quaysideSpace3: QuaysideSpace
            get() = throw ExceptionInInitializerError()
        val quaysideSpace4: QuaysideSpace
            get() = throw ExceptionInInitializerError()

        operator fun component1() = quaysideSpace1
        operator fun component2() = quaysideSpace2
        operator fun component3() = quaysideSpace3
        operator fun component4() = quaysideSpace4
    }
}

class PortSpace private constructor(position: Position, adjacent: List<Cell>, var hasSteamer: Boolean = false): Cell(position, adjacent) {

    companion object {

        val portSpace1: PortSpace
            get() = throw ExceptionInInitializerError()
        val portSpace2: PortSpace
            get() = throw ExceptionInInitializerError()
        val portSpace3: PortSpace
            get() = throw ExceptionInInitializerError()
        val portSpace4: PortSpace
            get() = throw ExceptionInInitializerError()
        val portSpace5: PortSpace
            get() = throw ExceptionInInitializerError()

        operator fun component1() = portSpace1
        operator fun component2() = portSpace2
        operator fun component3() = portSpace3
        operator fun component4() = portSpace4
        operator fun component5() = portSpace5

    }
}

object LibertyIsland: Cell(Position(-1, -1)) // has no adjacent, or if it has, remove the adjacent default

object LandExit: Cell(Position(-1, 1), listOf())