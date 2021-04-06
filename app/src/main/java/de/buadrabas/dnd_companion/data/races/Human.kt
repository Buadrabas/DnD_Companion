package de.buadrabas.dnd_companion.data.races

import de.buadrabas.dnd_companion.data.CharacterRace
import de.buadrabas.dnd_companion.data.RacialTraits
import de.buadrabas.dnd_companion.data.Vision

class Human(): CharacterRace {
	
	override val AttributeAdjustment: List<Int> = listOf(0,0,0,0,0,0)
	override val FavoredClass: String = "Any"
	override val RacialTraits: List<RacialTraits> = listOf(
		RacialTraits("Extra Feat", "Extra feat at 1st level, because humans are quick to master specialized tasks and varied in their talents."),
		RacialTraits("Extra Skillpoints", "4 extra skill points at 1st level and 1 extra skill point at each\n" +
				"additional level, since humans are versatile and capable")
	)
	override val Size: Size = Size(5)
	override val MovementSpeedFeet: Int = 30
	override val MovementSpeedMeter: Int = 9
	override val Vision: Vision = de.buadrabas.dnd_companion.data.Vision.NORMAL_VISION
	
}

