package dev.bug.tgame.application

import dev.bug.tgame.domain.Game
import dev.bug.tgame.domain.Person
import dev.bug.tgame.domain.Player

class PlayerJoinsGame {

    fun join(person: Person, game: Game): Player {
        return joinGame(person, game)
    }

    private fun joinGame(person: Person, game: Game): Player {
        return game.join(person)
    }

}