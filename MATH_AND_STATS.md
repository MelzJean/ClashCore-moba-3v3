# 📊 ClashCore: Combat Math & Scaling

This document defines the core algorithms used for damage calculation, gold scaling, and hero growth in the Twisted Core.

---

## ⚔️ Damage Calculation (Physical)
To prevent "flat damage" from making tanks invincible, we use a diminishing returns formula.

### The Armor Formula
Every point of armor increases a hero's **Effective Health (EHP)** by 1%.

**The Calculation:**
$$Damage\ Received = Raw\ Damage \times \left( \frac{100}{100 + Armor} \right)$$

**Reference Table:**
| Armor | Damage Reduction | Note |
| :--- | :--- | :--- |
| 0 | 0% | True Damage |
| 50 | 33.3% | Early game tankiness |
| 100 | 50% | Mid-game core items |
| 300 | 75% | Late-game "Receiver" build |

---

## 💰 Gold & Economy
* **Passive Gold:** 2 Gold / second.
* **Minion Kill:** 40 - 60 Gold.
* **Hero Takedown:** 200 Gold (+50 Assist).
* **Core Guardian:** 300 Gold to the killer, 150 to teammates.

---

## 📈 Level Scaling
Upon `levelUp()`, heroes gain stats based on their Class:
* **Carries:** +5 Attack, +40 HP.
* **Explorers:** +3 Attack, +50 HP, +5 Move Speed.
* **Receivers:** +2 Attack, +90 HP.

---
*Note: These values are subject to balancing during Phase 3 Playtesting.*
