package de.buadrabas.dnd_companion.data.races

open class races {
	val vision: Vision,
	val speed: Int,
			val size: Size,
			
}


enum class Vision (val vision: String) {
	NORMALVISION("Normal Vision"),
	LOWLIGHTVISION("Normal Vision"),
	DARKVISION("Normal Vision")
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