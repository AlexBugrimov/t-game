package dev.bug.tgame.domain

data class Player(val id: Long, private val personId: Long) {

    fun personId() = personId
}
