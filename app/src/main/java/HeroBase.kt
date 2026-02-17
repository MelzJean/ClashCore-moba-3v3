package com.MelzJean.ClashCore

/**
 * Base class for all 15 Heroes.
 * Defines shared stats like Attack, Defense, and Speed.
 */
open class HeroBase(
    val name: String,
    var hp: Int,
    var attackDamage: Int,
    var moveSpeed: Int,
    val role: String
) {
    fun levelUp() {
        hp += 50
        attackDamage += 5
        println("$name leveled up! HP is now $hp")
    }

    open fun useUltimate() {
        println("$name is casting their Ultimate Ability!")
    }
}

// Example of a specific hero using this base
class Bolt : HeroBase("Bolt", 600, 55, 320, "Carry") {
    override fun useUltimate() {
        println("Bolt fires a Massive Plasma Beam!")
    }
}
