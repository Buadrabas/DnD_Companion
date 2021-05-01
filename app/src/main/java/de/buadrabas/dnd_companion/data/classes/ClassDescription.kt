package de.buadrabas.dnd_companion.data.classes

import de.buadrabas.dnd_companion.data.Dice
import de.buadrabas.dnd_companion.data.character.Feats
import de.buadrabas.dnd_companion.data.character.Spells

abstract class ClassDescription {
	val BaseSaveBonus: List<Int> = listOf()
	val BaseAttackBonus: List<Int> = listOf()
	val MaxCrossLevelSkill: List<Int> = listOf()
	val MaxClassLevelSkill: List<Int> = listOf()
	val Feats: List<Feats> = listOf()
	val Spells: List<Spells> = listOf()
	val ClassDice: Dice = Dice(6)
}