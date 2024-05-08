package dev.bug.tgame.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class GameTest {

    @Test
    fun `new game assigned identifier`() {
        val game = Game("name", "handle")

        assertThat(game.handle())
            .isNotNull()
            .isNotBlank()
    }


}