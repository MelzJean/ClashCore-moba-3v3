package com.MelzJean.ClashCore

/**
 * AbilitySystem: Manages cooldowns and special effects for hero skills.
 */
class Ability(
    val name: String,
    val cooldownTime: Int, // in seconds
    val damage: Int = 0,
    val effectDuration: Float = 0f
) {
    var currentCooldown: Int = 0
    var isOnCooldown: Boolean = false

    fun useAbility(): Boolean {
        if (isOnCooldown) {
            println("$name is not ready! Wait ${currentCooldown}s")
            return false
        }
        
        // Activate Cooldown
        isOnCooldown = true
        currentCooldown = cooldownTime
        return true
    }

    // Called every second by MainActivity
    fun updateCooldown() {
        if (currentCooldown > 0) {
            currentCooldown--
        } else {
            isOnCooldown = false
        }
    }
}

/**
 * Examples of unique Skill Effects
 */
class AbilityEffects {
    
    // Ghost's Invisibility
    fun applyInvisibility(hero: HeroBase, duration: Float) {
        println("${hero.name} has vanished for $duration seconds!")
        // Logic: Set alpha to 0.3 and remove from enemy mini-map
    }

    // Tesla's Lightning Chain
    fun applyChainLightning(target: HeroBase, bounces: Int) {
        println("Lightning struck ${target.name} and bounced $bounces times!")
        // Logic: Find nearest enemy and jump to them
    }
}
