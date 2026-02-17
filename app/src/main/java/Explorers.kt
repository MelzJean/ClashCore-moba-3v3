package com.MelzJean.ClashCore

/**
 * Explorer Heroes: High mobility units designed for the jungle and roaming.
 * Stats are: Name, HP, Attack, MoveSpeed, Role
 */

// 1. Ghost - The Shadow Stalker
class Ghost : HeroBase("Ghost", 500, 75, 350, "Explorer") {
    override fun useUltimate() {
        println("Ghost activates Phantom Strike! Teleporting behind target.")
    }
}

// 2. Raze - The Scrapyard Biker
class Raze : HeroBase("Raze", 650, 50, 400, "Explorer") {
    override fun useUltimate() {
        println("Raze uses Road Rage! Gaining immunity to slows.")
    }
}

// 3. Echo - The Soundwave Scout
class Echo : HeroBase("Echo", 550, 45, 330, "Explorer") {
    override fun useUltimate() {
        println("Echo releases Resonating Scream! All nearby enemies silenced.")
    }
}

// 4. Flicker - The Dimension Hopper
class Flicker : HeroBase("Flicker", 480, 60, 360, "Explorer") {
    override fun useUltimate() {
        println("Flicker tears a Void portal between the curvy lanes!")
    }
}

// 5. Mel - The Sky Hunter
class Mel : HeroBase("Mel", 520, 70, 380, "Explorer") {
    override fun useUltimate() {
        println("Mel executes with Talon Strike from above!")
    }
}
