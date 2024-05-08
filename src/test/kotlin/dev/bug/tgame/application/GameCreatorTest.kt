package dev.bug.tgame.application

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test

class GameCreatorTest {

    @Test
    fun `new game created with given name`() {
        val gameCreator = GameCreator()
        val game = gameCreator.createNewGame("game name")

        assertNotNull(game)
        assertThat(game.name)
            .isEqualTo("game name")
    }

    @Test
    fun `games assigned unique handle`() {
        val gameCreator = GameCreator()
        val firstGame = gameCreator.createNewGame("T game")
        val secondGame = gameCreator.createNewGame("T game")

        assertThat(firstGame.handle())
            .isNotEqualTo(secondGame.handle())
    }
}