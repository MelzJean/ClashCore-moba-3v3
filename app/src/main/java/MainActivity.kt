package com.MelzJean.ClashCore

/**
 * The Heart of ClashCore.
 * This class manages the 5-minute match loop and hero states.
 */
class MainActivity {
    var health: Int = 100
    var isAlive: Boolean = true
    var gold: Int = 0
    
    // 5-minute match timer in seconds
    var matchTimer: Int = 300 

    fun startMatch() {
        println("Welcome to the Twisted Core. Match Starting!")
    }

    fun earnGold(amount: Int) {
        gold += amount
        println("Gold earned: $amount. Total Gold: $gold")
    }

    fun takeDamage(amount: Int) {
        health -= amount
        if (health <= 0) {
            isAlive = false
            println("Hero defeated! Respawning in 10 seconds...")
        }
    }
}
