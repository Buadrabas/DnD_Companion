package de.buadrabas.dnd_companion.data.classes

import de.buadrabas.dnd_companion.data.Dice
import de.buadrabas.dnd_companion.data.character.FeatDescription

abstract class ClassDescription(var level: Int) {
	val BaseSaveBonus: List<Int> = listOf()
	val BaseAttackBonus: List<Int> = listOf()
	val MaxCrossLevelSkill: List<Int> = listOf()
	val MaxClassLevelSkill: List<Int> = listOf()
	val Feats: List<FeatDescription> = listOf()
	val Spells: List<String> = listOf()
	val ClassDice: Dice = Dice(12)
}