package com.MelzJean.ClashCore

/**
 * ShopManager: Handles gold transactions and item upgrades.
 * Ensures players have enough gold before boosting hero stats.
 */
class ShopManager(val hero: HeroBase) {

    var currentGold: Int = 0

    // Add gold from minion kills or hero takedowns
    fun addGold(amount: Int) {
        currentGold += amount
        println("Gold updated: $currentGold")
    }

    /**
     * Attempts to purchase an item.
     * @param itemName Name of the item
     * @param cost Gold cost
     * @param statBoost The amount of Attack or HP to add to the hero
     */
    fun buyItem(itemName: String, cost: Int, statBoost: Int, isAttackItem: Boolean) {
        if (currentGold >= cost) {
            currentGold -= cost
            
            if (isAttackItem) {
                hero.attackDamage += statBoost
                println("Purchased $itemName! Attack increased by $statBoost.")
            } else {
                hero.hp += statBoost
                println("Purchased $itemName! HP increased by $statBoost.")
            }
        } else {
            println("Not enough gold for $itemName! You need ${cost - currentGold} more.")
        }
    }
}
