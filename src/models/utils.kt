package models

data class Position(val column: Int, val step: Int) {
    constructor(coordinates: Pair<Int, Int>) : this(coordinates.first, coordinates.second)
}

fun Position.toPair() = column to step

annotation class ServerOnly