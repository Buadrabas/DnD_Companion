package de.buadrabas.dnd_companion.data.races

data class RaceDescription(
	val AbilityChanges: List<Int>,
	val SpecialFeats: List<String>,
	val Size: Size,
	val Language: List<String>,
	val Vision: Vision
){

}

enum class Vision (val vision: String) {
	NORMAL_VISION("Normal Vision"),
	LOW_LIGHT_VISION("Normal Vision"),
	DARK_VISION("Normal Vision")
}

enum class Size (val Size: String){
	FLY("Fly"),
	DIMINUTIVE("Diminutive"),
	TINY("Tiny"),
	SMALL("Small"),
	MEDIUM("Medium"),
	LARGE("Large"),
	HUGE("Huge"),
	GARGANTUAN("Gargantuan"),
	COLOSSAL("Colossal")
}