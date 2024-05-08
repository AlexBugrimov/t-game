package dev.bug.tgame.domain

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import io.kotest.matchers.shouldNotBe

class GameTest : StringSpec({

    "new game assigned identifier" {
        val game = Game("name", "handle")

        game shouldNotBe null
        game.name shouldBe "name"
        game.handle()
            .shouldNotBe(null)
            .shouldBe("handle")
    }
})
