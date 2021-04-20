package de.buadrabas.dnd_companion.data.character

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.data.CharacterRace
import de.buadrabas.dnd_companion.data.Vision
import de.buadrabas.dnd_companion.data.classes.Barbarian
import de.buadrabas.dnd_companion.data.classes.ClassDescription
import de.buadrabas.dnd_companion.data.races.Human

@Entity(tableName = "character_gallery")
data class CharacterClass(
	
	@PrimaryKey(autoGenerate = true)
	var characterId: Long = 0L,
	@ColumnInfo(name = "firstName")
	var firstName: String = "",
	@ColumnInfo(name = "secondName")
	var secondName: String = "",
	val fullName: String = firstName + secondName,
	@ColumnInfo(name = "playerName")
	var playerName: String = "",
	@ColumnInfo(name = "classList")
	var classes: ClassDescription = Barbarian(1),
	@ColumnInfo(name = "Race")
	var race: CharacterRace = Human(),
	@ColumnInfo(name = "Age")
	var age: Int = 0,
	@ColumnInfo(name = "Alignment")
	var alignment: Alignment = Alignment.GOOD_LAWFUL,
	@ColumnInfo(name = "Deity")
	var Deity: String = "",
	@ColumnInfo(name = "Religion")
	var Religion: String = "",
	@ColumnInfo(name = "Height")
	var Height: Int = 0,
	@ColumnInfo(name = "Weight")
	var Weight: Int = 0,
	@ColumnInfo(name = "Vision")
	var Vision: Vision = de.buadrabas.dnd_companion.data.Vision.NORMAL_VISION,
	@ColumnInfo(name = "Characterlevel")
	var CharacterLevel: Int = 1,
	@ColumnInfo(name = "ExpPoints")
	var ExpPoints: Int = 0,
	@ColumnInfo(name = "Gender")
	var Gender: Gender = de.buadrabas.dnd_companion.data.character.Gender.MALE,
	@ColumnInfo(name = "EyeColor")
	var Eyes: String = "",
	@ColumnInfo(name = "HairColor")
	var Hair: String = "",
	@ColumnInfo(name = "HitpointsMax")
	var HitpointsMax: Int = 0,
	@ColumnInfo(name = "HitpointsCur")
	var HitpointsCur: Int = 0,
	@ColumnInfo(name = "AC")
	var AC: Int = 0,
	@ColumnInfo(name = "Speed in fields")
	var Speed: Int = 0,
	@ColumnInfo(name = "DamageReduction")
	var DR: Int = 0,
	@ColumnInfo(name = "Initiative")
	var Initiative: Int = 0,
	@ColumnInfo(name = "Languages")
	var Languages: List<String> = listOf(),
	@ColumnInfo(name = "Biography")
	var Biography: String = "",
	@ColumnInfo(name = "AbilityList")
	var Abilities: Abilities = Abilities(0, 0, 0, 0, 0, 0),
	@ColumnInfo(name = "characterPicture")
	var characterPicture: Int = R.drawable.ic_launcher_foreground
)

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