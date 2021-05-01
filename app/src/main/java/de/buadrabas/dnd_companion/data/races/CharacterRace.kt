package de.buadrabas.dnd_companion.data.races

abstract class CharacterRace {
	abstract val AttributeAdjustment: List<Int>
	abstract val RacialTraits: List<RacialTraits>
	abstract val FavoredClass: String
	abstract val Size: Size // Size are from
	abstract val MovementSpeedFeet: Int
	abstract val MovementSpeedMeter: Int
	abstract val Vision: Vision
	abstract val RaceName: String
}

/**
 * Need Class for Size with 3 Fields: Creature Size, Space, Natural Reach
 */


enum class Vision(val vision: String) {
	NORMAL_VISION("Normal Vision"),
	LOW_LIGHT_VISION("Normal Vision"),
	DARK_VISION("Normal Vision")
}

data class RacialTraits(val traitTitle: String, val traitDescription: String)