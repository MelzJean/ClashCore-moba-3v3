package com.MelzJean.ClashCore

/**
 * Item Data Class: A simple structure for every item in the shop.
 */
data class Item(
    val id: Int,
    val name: String,
    val cost: Int,
    val statBoost: Int,
    val isAttackItem: Boolean,
    val description: String
)

/**
 * ItemDatabase: The master list of all 27 items.
 */
class ItemDatabase {
    val allItems = listOf(
        // --- PHYSICAL OFFENSE (Carries) ---
        Item(1, "Rusty Dirk", 500, 10, true, "+10 Attack"),
        Item(2, "Heavy Recurve", 900, 20, true, "+20% Attack Speed"),
        Item(3, "Core Breaker", 2100, 60, true, "Deals extra damage to Turrets"),
        Item(4, "Vampire Fangs", 2000, 35, true, "Adds 15% Lifesteal"),
        Item(5, "The Last Stand", 2500, 70, true, "Ultimate damage item"),

        // --- MAGIC & TECH (Mages) ---
        Item(10, "Power Cell", 500, 20, true, "+20 Magic Power"),
        Item(11, "Arc Lightning", 2100, 80, true, "Skills bounce to 2 enemies"),
        Item(12, "Frozen Orb", 2200, 70, true, "Skills slow enemies by 30%"),

        // --- DEFENSE & HEALTH (Receivers) ---
        Item(19, "Lead Plate", 500, 15, false, "+15 Armor"),
        Item(20, "Vitality Gem", 600, 250, false, "+250 Health"),
        Item(21, "Titan’s Heart", 2200, 1000, false, "Massive HP and Regen"),
        Item(22, "Immortal Cape", 2500, 500, false, "Revive after death")
        
        // Note: You can add the remaining items following this same pattern!
    )

    fun getItemByName(name: String): Item? {
        return allItems.find { it.name == name }
    }
}
