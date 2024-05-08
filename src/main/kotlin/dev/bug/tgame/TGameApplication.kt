package dev.bug.tgame

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TGameApplication

fun main(args: Array<String>) {
    runApplication<TGameApplication>(*args)
}
