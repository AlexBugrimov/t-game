package dev.bug.tgame.application

import com.github.kkuegler.PermutationBasedHumanReadableIdGenerator
import dev.bug.tgame.domain.Game

class GameCreator {

    private val isGen = PermutationBasedHumanReadableIdGenerator()

    fun createNewGame(nameOfName: String): Game {
        val handle = isGen.generate()
        return Game(nameOfName, handle)
    }
}