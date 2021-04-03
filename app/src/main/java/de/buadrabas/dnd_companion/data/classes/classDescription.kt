package de.buadrabas.dnd_companion.data.classes

import de.buadrabas.dnd_companion.data.Dice

data class ClassDescription(
	val ClassName: String,
	val BaseSaveBonus: Int,
	val BaseAttackBonus: Int,
	val CharacterLevel:Int,
	val MaxCrossLevelSkill: Int,
	val MaxClassLevelSkill: Int,
	val Feats: List<String>,
	val ExperiencePoints: Int,
	val Spells: List<String>,
	val ClassDice: Dice
){

}