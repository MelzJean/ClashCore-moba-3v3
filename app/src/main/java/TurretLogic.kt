package com.MelzJean.ClashCore

/**
 * TurretLogic: Handles the defensive structures on the Twisted Core map.
 * Features: Consecutive hit scaling and early-game damage reduction.
 */
class Turret(
    val type: String, // "Outer", "Inner", or "PowerCore"
    var hp: Int,
    var baseDamage: Int
) {
    private var consecutiveHits: Int = 0

    /**
     * Calculates damage to a hero.
     * Damage increases by 20% for every consecutive shot on the same target.
     */
    fun calculateDamage(): Int {
        val multiplier = 1.0 + (consecutiveHits * 0.2)
        return (baseDamage * multiplier).toInt()
    }

    fun onTargetHit() {
        consecutiveHits++
    }

    fun resetTarget() {
        consecutiveHits = 0
    }

    fun takeDamage(amount: Int) {
        hp -= amount
        if (hp <= 0) {
            println("The $type Turret has been destroyed!")
        }
    }
}

/**
 * Manager to spawn the turrets for a match.
 */
class TurretManager {
    val outerTurret = Turret("Outer", 3500, 150)
    val innerTurret = Turret("Inner", 4500, 200)
    val powerCore = Turret("PowerCore", 7000, 300)
}
