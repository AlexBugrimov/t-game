package dev.bug.tgame.domain

class Game(val name: String,
           private val handle: String,
           private val players: MutableList<Player> = mutableListOf()
) {

    fun handle() = handle

    fun players(): List<Player> {
        return players
    }

    fun join(person: Person): Player {
        val player = Player(1, person.id)
        players.add(player)
        return player
    }
}