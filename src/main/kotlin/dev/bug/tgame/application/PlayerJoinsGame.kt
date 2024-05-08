package dev.bug.tgame.application

import dev.bug.tgame.domain.Game
import dev.bug.tgame.domain.Person

class PlayerJoinsGame {

    fun join(person: Person, game: Game) = game.join(person)
}