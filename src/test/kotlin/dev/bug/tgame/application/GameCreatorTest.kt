package dev.bug.tgame.application

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
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
}