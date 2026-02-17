package com.MelzJean.ClashCore

/**
 * Receiver Heroes: The front-line tanks and supports.
 * High HP and defensive utility to protect the team.
 */

// 1. Bastion - The Shield Wall
class Bastion : HeroBase("Bastion", 900, 40, 290, "Receiver") {
    override fun useUltimate() {
        println("Bastion deploys Energy Barrier! Massive shield for all allies.")
    }
}

// 2. Magnus - The Gravity Titan
class Magnus : HeroBase("Magnus", 850, 45, 295, "Receiver") {
    override fun useUltimate() {
        println("Magnus uses Event Horizon! Pulling all enemies to his center.")
    }
}

// 3. Cinder - The Phoenix Knight
class Cinder : HeroBase("Cinder", 800, 50, 310, "Receiver") {
    override fun useUltimate() {
        println("Cinder ignites! Heals 50% HP and burns nearby enemies.")
    }
}

// 4. Vector - The Hook Master
class Vector : HeroBase("Vector", 820, 42, 305, "Receiver") {
    override fun useUltimate() {
        println("Vector fires the Mega-Hook! Stuns and drags the enemy Core.")
    }
}

// 5. Grove - The Nature Spirit
class Grove : HeroBase("Grove", 880, 35, 300, "Receiver") {
    override fun useUltimate() {
        println("Grove grows an Ancient Forest! Huge area-of-effect heal.")
    }
}
