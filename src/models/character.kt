package models

sealed class Character(var cell: Cell, var isVisible: Boolean) {
    var isSuspect = true
    val isInnocent
        get() = !isSuspect

    open fun moveTo(cell: Cell) {
        TODO()
    }
}

object AlfredElyBeach: Character(StreetSpace.modelingStreetSpace, true) {
    fun constructMetroEntrance(cell: StreetSpace) {
        TODO()
    }
}

object CloudRider: Character(StreetSpace.modelingStreetSpace, true) {
    fun constructBuildingSite(cell: StreetSpace) {}
    override fun moveTo(cell: Cell) {}
}

object MonkEastman: Character(StreetSpace.modelingStreetSpace, false) {
    fun moveAnotherCharacter(character: Character, to: Cell) {}
}

object JamesCallahan: Character(StreetSpace.modelingStreetSpace, true) {
    fun moveInvestigationTile(tile: InvestigationTile, to: Pair<StreetSpace?, StreetSpace?>) {
        TODO()
    }
}

object EdwardSmith: Character(StreetSpace.modelingStreetSpace, true) {
    fun moveSteamer(from: PortSpace, to: PortSpace) {
        TODO()
    }
}

object FrancisTumblety: Character(StreetSpace.modelingStreetSpace, false) {
    fun hypnotize(adjacent: Character, target: Character) {
        TODO()
    }
}

object LewisHowardLatimer: Character(StreetSpace.modelingStreetSpace, true) {
    fun installGasLamp(cell: StreetSpace) {
        TODO()
    }
}

object EmmaGrant: Character(StreetSpace.modelingStreetSpace, true) {
    fun createPark(cell: StreetSpace) {
        TODO()
    }
}

object Informant {
    val cell : Cell = LibertyIsland
    var mute = false
    val talkative
        get() = !mute
    
    @ServerOnly
    val innocents: MutableList<Character> = mutableListOf()
}