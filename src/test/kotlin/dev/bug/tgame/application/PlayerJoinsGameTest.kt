package dev.bug.tgame.application

import dev.bug.tgame.domain.Person
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class PlayerJoinsGameTest : StringSpec({

    "person joiner existing game then added as player" {
        val person = Person(27)
        val playerJoinsGame = PlayerJoinsGame()
        val game = GameCreator().createNewGame("T game")

        val player = playerJoinsGame.join(person = person, game)

        player.id shouldNotBe null
        game.players() shouldHaveSize 1
        game.players() shouldContainExactly listOf(player)
        player.personId() shouldBe 27
    }

    "two persons join existing game then both added as different players" {
        val playerJoinsGame = PlayerJoinsGame()
        val game = GameCreator().createNewGame("T game")
        val firstPerson = Person(7)
        val secondPerson = Person(8)

        val firstPlayer = playerJoinsGame.join(person = firstPerson, game)
        val secondPlayer = playerJoinsGame.join(person = secondPerson, game)

        firstPlayer shouldNotBe secondPlayer
    }
})
