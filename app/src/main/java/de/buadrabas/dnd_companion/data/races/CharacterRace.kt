package de.buadrabas.dnd_companion.data

import de.buadrabas.dnd_companion.data.races.Size

interface CharacterRace {
	val AttributeAdjustment: List<Int>
	val RacialTraits: List<String>
	val FavoredClass: String
	val Size: Int // Size are from
}

/**
 * Need Class for Size with 3 Fields: Creature Size, Space, Natural Reach
 */


data class RaceDescription(
    val AbilityChanges: List<Int>,
    val SpecialFeats: List<String>,
    val Size: Size,
    val Language: List<String>,
    val Vision: Vision
) {
	
}

enum class Vision(val vision: String) {
	NORMAL_VISION("Normal Vision"),
	LOW_LIGHT_VISION("Normal Vision"),
	DARK_VISION("Normal Vision")
}
