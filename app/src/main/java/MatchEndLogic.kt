package com.MelzJean.ClashCore

/**
 * MatchEndLogic: The referee of the game.
 * Monitors the Power Cores and declares the winner.
 */
class MatchEndLogic {

    var isMatchActive: Boolean = true
    var winner: String? = null

    /**
     * Checks the status of the Power Cores.
     * This would be called every time a Power Core takes damage.
     */
    fun checkWinCondition(blueCoreHP: Int, redCoreHP: Int) {
        if (!isMatchActive) return

        if (blueCoreHP <= 0) {
            endMatch("Red Team (Rust-Born)")
        } else if (redCoreHP <= 0) {
            endMatch("Blue Team (Sovereignty)")
        }
    }

    private fun endMatch(winningFaction: String) {
        isMatchActive = false
        winner = winningFaction
        
        println("╔════════════════════════════════════╗")
        println("║           MATCH FINISHED           ║")
        println("║       VICTORY: $winningFaction      ║")
        println("╚════════════════════════════════════╝")
        
        // Logic to reward players with Core Shards for their Rank
        calculateRankRewards()
    }

    private fun calculateRankRewards() {
        println("Calculating Rank progression... +1 Core Shard awarded.")
    }
}
