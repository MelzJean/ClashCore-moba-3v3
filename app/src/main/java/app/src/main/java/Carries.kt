package com.MelzJean.ClashCore

/**
 * Carry Heroes: High damage output, low health. 
 * They scale heavily with items from the Shop.
 */

// 1. Bolt - The Plasma Sniper
class Bolt : HeroBase("Bolt", 580, 85, 310, "Carry") {
    override fun useUltimate() {
        println("Bolt fires a Hyper-Beam! Infinite range strike.")
    }
}

// 2. Viper - The Toxic Chemist
class Viper : HeroBase("Viper", 600, 65, 315, "Carry") {
    override fun useUltimate() {
        println("Viper detonates a Chemical Bomb! Mass AoE poison.")
    }
}

// 3. Tesla - The Lightning Prodigy
class Tesla : HeroBase("Tesla", 550, 75, 325, "Carry") {
    override fun useUltimate() {
        println("Tesla summons an Overload Storm! Chain lightning active.")
    }
}

// 4. Nitro - The Siege Engineer
class Nitro : HeroBase("Nitro", 620, 70, 300, "Carry") {
    override fun useUltimate() {
        println("Nitro deploys a Siege Turret! Triple damage to structures.")
    }
}

// 5. Ember - The Solar Flare
class Ember : HeroBase("Ember", 570, 80, 320, "Carry") {
    override fun useUltimate() {
        println("Ember transforms into Supernova! Burn damage aura active.")
    }
}
