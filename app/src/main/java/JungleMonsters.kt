package com.MelzJean.ClashCore

/**
 * JungleMonsters: Defines the neutral creeps in the Twisted Core map.
 */
open class Monster(
    val name: String,
    var hp: Int,
    val goldReward: Int,
    val expReward: Int
)

/**
 * The three main neutral threats.
 */
class JungleDatabase {
    
    // 1. Blue Sentry: Grants Mana/Energy Regen
    val blueSentry = Monster("Blue Sentry", 1200, 80, 100)

    // 2. Red Striker: Grants Slow-on-hit and Burn Damage
    val redStriker = Monster("Red Striker", 1200, 80, 100)

    // 3. The Core Guardian: The massive Boss in the center
    val coreGuardian = Monster("Core Guardian", 5000, 300, 500)

    /**
     * Logic for when a hero kills a monster.
     */
    fun onMonsterSlain(monster: Monster, killer: HeroBase, shop: ShopManager) {
        shop.addGold(monster.goldReward)
        killer.levelUp()
        
        when (monster.name) {
            "Blue Sentry" -> println("${killer.name} received FLOW STATE (CDR Buff)!")
            "Red Striker" -> println("${killer.name} received IGNITION (Burn Buff)!")
            "Core Guardian" -> println("TEAM BUFF: CORE OVERLOAD ACTIVATED!")
        }
    }
}
