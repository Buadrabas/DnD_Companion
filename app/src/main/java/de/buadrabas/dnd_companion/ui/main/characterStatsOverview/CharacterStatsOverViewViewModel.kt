package de.buadrabas.dnd_companion.ui.main.characterStatsOverview

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import de.buadrabas.dnd_companion.data.character.CharacterDescription
import de.buadrabas.dnd_companion.data.character.CharacterDescriptionDao

class CharacterStatsOverViewViewModel(
	private val characterId: Long = 0L,
	dataSource: CharacterDescriptionDao
) : ViewModel() {
	
	val dataBase = dataSource
	
	private val character: LiveData<CharacterDescription>
	fun getCharacter() = character
	
	init {
		character = dataBase.getCharacterWithId(characterId)
	}
	
	private val _navigateToDifferentSheetFragment = MutableLiveData<Boolean?>()
	
	val navigateToDifferentSheetFragment: LiveData<Boolean?>
		get() = _navigateToDifferentSheetFragment
}