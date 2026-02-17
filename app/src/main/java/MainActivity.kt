package com.MelzJean.ClashCore

/**
 * The Heart of ClashCore.
 * Now modified to connect with Shop, Turrets, and Win Conditions.
 */
class MainActivity {
    // 1. Initialize the Hero (Using Bolt as an example)
    val playerHero = Bolt()
    
    // 2. Initialize Game Managers
    val shop = ShopManager(playerHero)
    val matchEnd = MatchEndLogic()
    val turrets = TurretManager()
    
    var matchTimer: Int = 300 // 5-minute countdown

    fun startMatch() {
        println("Welcome to the Twisted Core. Match Starting!")
        println("Playing as: ${playerHero.name} | Role: ${playerHero.role}")
    }

    /**
     * Simulation of a game tick (happens every second)
     */
    fun onGameTick() {
        if (!matchEnd.isMatchActive) return

        if (matchTimer > 0) {
            matchTimer--
            // Check win conditions periodically
            // Here we pass dummy values, but in-game these would be real turret HPs
            matchEnd.checkWinCondition(turrets.powerCore.hp, 7000) 
        } else {
            println("TIME UP! Sudden Death Overload initiated.")
        }
    }

    fun handleHeroKill() {
        println("Enemy defeated!")
        shop.addGold(200) // Reward for a hero kill
    }

    fun handleTakeTurretDamage() {
        val damage = turrets.outerTurret.calculateDamage()
        playerHero.hp -= damage
        turrets.outerTurret.onTargetHit()
        
        println("Hit by Turret! Damage: $damage. Remaining HP: ${playerHero.hp}")
        
        if (playerHero.hp <= 0) {
            println("Hero executed by Turret!")
            turrets.outerTurret.resetTarget()
        }
    }
}
