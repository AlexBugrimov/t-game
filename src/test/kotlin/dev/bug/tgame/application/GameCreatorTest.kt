package dev.bug.tgame.application

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class GameCreatorTest : StringSpec({

    "new game created with given name" {
        val gameCreator = GameCreator()
        val game = gameCreator.createNewGame("game name")

        game shouldNotBe null
        game.name shouldBe "game name"
    }

    "games assigned unique handle" {
        val gameCreator = GameCreator()
        val firstGame = gameCreator.createNewGame("T game")
        val secondGame = gameCreator.createNewGame("T game")

        firstGame.handle() shouldNotBe secondGame.handle()
    }
})