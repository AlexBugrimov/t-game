package dev.bug.tgame.domain

import java.util.concurrent.atomic.AtomicLong

class Game(
    val name: String,
    private val handle: String,
    private val players: MutableList<Player> = mutableListOf(),
    private val playerIdGenerator: AtomicLong = AtomicLong()
) {

    fun handle() = handle

    fun players(): List<Player> {
        return players
    }

    fun join(person: Person): Player {
        val player = Player(playerIdGenerator.getAndIncrement(), person.id)
        players.add(player)
        return player
    }
}