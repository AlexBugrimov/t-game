package dev.bug.tgame.application

import dev.bug.tgame.domain.Person
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.collections.shouldContainExactly
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class PlayerJoinsGameTest : StringSpec({

    "person joiner existing game then added as player if not already joined" {
        val person = Person(27)
        val playerJoinsGame = PlayerJoinsGame()
        val game = GameCreator().createNewGame("T game")

        val player = playerJoinsGame.join(person = person, game)

        player.id shouldNotBe null
        game.players() shouldContainExactly listOf(player)

        player.personId() shouldBe 27
    }
})
