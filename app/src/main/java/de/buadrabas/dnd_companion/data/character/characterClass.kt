package de.buadrabas.dnd_companion.data.character

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.room.Entity
import de.buadrabas.dnd_companion.data.RaceDescription
import de.buadrabas.dnd_companion.data.Vision
import de.buadrabas.dnd_companion.data.classes.ClassDescription
import de.buadrabas.dnd_companion.data.races.Vision
import de.buadrabas.dnd_companion.data.races.RaceDescription


data class CharacterClass(
	val firstName: String,
	val secondName: String,
	val playerName: String,
	val age: Int,
	val alignment: Alignment,
	val Deity: String,
	val Religion: String,
	val Height: Int,
	val Weight: Int,
	val Vision: Vision,
	val CharacterLevel: Int,
	val ExpLevel: Int,
	val Gender: Gender,
	val Eyes: String,
	val Hair: String,
	val Ability: List<Int>,
	val Hitpoints: Int,
	val AC: Int,
	val Speed: Int,
	val SR: Int,
	val Initiative: Int,
	val Languages: List<String>,
	val Biography: String,
	val classes: ClassDescription,
	val races: RaceDescription
) {

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
	val Strength: Int,
	val Dextery: Int,
	val Constituion: Int,
	val Intelligence: Int,
	val Wisdom: Int,
	val Charisma: Int
)

class CharaDataClass() {
	private val _name  = MutableLiveData<String>()
	val name: LiveData<String> = _name
	
	var _strength : Int = 10
	var _Dextery : Int = 10
	var _strength : Int = 10
	var _strength : Int = 10
	var _strength : Int = 10
	var _alignment: Alignment
	
	var CharacterClass: CharacterClass
	
	
	fun setName(charaName: String){
		_name.value = charaName
	}
	
	
}

enum class Alignment{
	
	val Lawful_Good: String = "Lawful Good",
	val Lawful_Neutral: String = "Neutral Lawful",
	val Lawful_Evil: String = "Evil Lawful",
	val Neutral_Good: String = "Good Neutral",
	val Neutral: String = "Neutral",
	val  Neutral_Evil: String = "Neutral Evil",
	val Chaotic_Good: String = "Chaotic  Good",
	val Chaotic_Neutral: String = "Chaotic Neutral",
	val Chaotic_Evil: String = "Chaotic Lawful"
}