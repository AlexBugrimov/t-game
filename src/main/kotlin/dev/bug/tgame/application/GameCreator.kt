package dev.bug.tgame.application

import dev.bug.tgame.domain.Game

class GameCreator {
    fun createNewGame(nameOfName: String): Game {
        return Game(nameOfName)
    }
}