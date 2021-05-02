package de.buadrabas.dnd_companion.data.races

data class Size(var RaceSize: Int) {
	
	private val _nameSize: List<String> =
		listOf(
			"Fine", "Diminutive", "Tiny", "Small", "Medium", "Large (tall)", "Large (long)",
			"Huge (tall)", "Huge", "Huge (long)", "Gargantuan (tall)", "Gargantuan (long)",
			"Colossal (tall)", "Colossal (long)"
		)
	
	fun getNameSize(): String {
		return _nameSize[RaceSize]
	}
	
	private val _creatureSizeFeet: List<Double> =
		listOf(0.5, 1.0, 2.5, 5.0, 5.0, 10.0, 10.0, 15.0, 15.0, 20.0, 20.0, 30.0, 30.0)
	
	fun getCreatureSizeFeet(): Double {
		return _creatureSizeFeet[RaceSize]
	}
	
	private val _creatureSizeMeter: List<Double> =
		listOf(0.15, 0.3, 0.75, 1.5, 1.5, 3.0, 3.0, 4.5, 4.5, 6.0, 6.0, 9.0, 9.0)
	
	fun getCreatureSizeMeter(): Double {
		return _creatureSizeMeter[RaceSize]
	}
	
	private val _reachofSizeFeet: List<Double> =
		listOf(0.0, 0.0, 0.0, 5.0, 5.0, 10.0, 5.0, 15.0, 10.0, 20.0, 15.0, 30.0, 20.0)
	
	fun getReachOfSizeFeet(): Double {
		return _reachofSizeFeet[RaceSize]
	}
	
	private val _reachOfSizeMeter: List<Double> =
		listOf(0.0, 0.0, 0.0, 1.5, 1.5, 3.0, 1.5, 4.5, 3.0, 6.0, 4.5, 9.0, 6.0)
	
	fun getReachOfSizeMeter(): Double {
		return _reachOfSizeMeter[RaceSize]
	}
	
	
}
