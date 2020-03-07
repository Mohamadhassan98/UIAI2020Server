package models

import java.lang.IllegalArgumentException
import kotlin.test.todo

enum class Tile() {
    BuildingSite, MetroEntrance, GasLamp, Park;
    var cells: MutableList<Cell> = mutableListOf()
}

class InvestigationTile private constructor() {
    var blockedCells: Pair<StreetSpace, StreetSpace> = StreetSpace.modelingStreetSpace to StreetSpace.modelingStreetSpace
        get() = throw ExceptionInInitializerError()
        set(value) {
            todo {
                if (value.second !in value.first.adjacent) {
                    throw IllegalArgumentException("Cells are not adjacent")
                }
            }
            field = value
        }

    companion object {
        val investigationTile1: InvestigationTile
            get() = throw ExceptionInInitializerError()
        val investigationTile2: InvestigationTile
            get() = throw ExceptionInInitializerError()

        operator fun component1() = investigationTile1
        operator fun component2() = investigationTile2
    }
}