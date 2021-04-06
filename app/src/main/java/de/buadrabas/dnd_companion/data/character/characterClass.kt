package de.buadrabas.dnd_companion.data.character

import de.buadrabas.dnd_companion.data.CharacterRace
import de.buadrabas.dnd_companion.data.Vision
import de.buadrabas.dnd_companion.data.classes.Barbarian
import de.buadrabas.dnd_companion.data.classes.ClassDescription
import de.buadrabas.dnd_companion.data.races.Human


class CharacterClass() {
	var firstName: String = ""
	var secondName: String= ""
	var playerName: String= ""
	var classes: ClassDescription = Barbarian(1)
	var races: CharacterRace = Human()
	var age: Int = 0
	var alignment: Alignment = Alignment.GOOD_LAWFUL
	var Deity: String = ""
	var Religion: String = ""
	var Height: Int = 0
	var Weight: Int = 0
	var Vision: Vision = de.buadrabas.dnd_companion.data.Vision.NORMAL_VISION
	var CharacterLevel: Int = 0
	var ExpLevel: Int = 0
	var Gender: Gender = de.buadrabas.dnd_companion.data.character.Gender.MALE
	var Eyes: String = ""
	var Hair: String = ""
	var Ability: List<Int> = listOf()
	var Hitpoints: Int = 0
	var AC: Int = 0
	var Speed: Int = 0
	var SR: Int = 0
	var Initiative: Int = 0
	var Languages: List<String> = listOf()
	var Biography: String = ""
	var Abilities: Abilities = Abilities(0,0,0,0,0,0)
}

enum class Alignment(val alignment: String) {
	GOOD_LAWFUL("Lawful Good"),
	GOOD_NEUTRAL("Neutral Good"),
	GOOD_CHAOTIC("Chaotic Good"),
	NEUTRAL_LAWFUL("Lawful Neutral"),
	NEUTRAL("Neutral"),
	NEUTRAL_CHAOTIC("Chaotic Neutral"),
	EVIL_LAWFUL("Lawful Evil"),
	EVIL_NEUTRAL("Neutral Evil"),
	EVIL_CHAOTIC("Chaotic Evil"),
}

enum class Gender(val gender: String) {
	MALE("Male"),
	FEMALE("FEMALE"),
}

data class Abilities(
	var Strength: Int,
	var Dextery: Int,
	var Constituion: Int,
	var Intelligence: Int,
	var Wisdom: Int,
	var Charisma: Int
)