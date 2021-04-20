package de.buadrabas.dnd_companion.data

import de.buadrabas.dnd_companion.data.races.Size

interface CharacterRace {
	val AttributeAdjustment: List<Int>
	val RacialTraits: List<RacialTraits>
	val FavoredClass: String
	val Size: Size // Size are from
	val MovementSpeedFeet: Int
	val MovementSpeedMeter: Int
	val Vision: Vision
	val RaceName: String
}

/**
 * Need Class for Size with 3 Fields: Creature Size, Space, Natural Reach
 */


enum class Vision(val vision: String) {
	NORMAL_VISION("Normal Vision"),
	LOW_LIGHT_VISION("Normal Vision"),
	DARK_VISION("Normal Vision")
}

data class RacialTraits(val traitTitle: String, val traitDescription: String) {

}