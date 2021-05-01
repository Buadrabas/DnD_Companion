package de.buadrabas.dnd_companion.ui.characterSheet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import de.buadrabas.dnd_companion.data.character.CharacterDescription
import de.buadrabas.dnd_companion.data.character.CharacterDescriptionDao
import kotlinx.coroutines.Job

class CharacterSheetViewModel (
	private val characterId: Long = 0L,
	dataSource: CharacterDescriptionDao
) : ViewModel(){
	
	val database = dataSource
	
	private val character: LiveData<CharacterDescription>
	
	fun getCharacter() = character
	
	init{
		character=database.getCharacterWithId(characterId)
	}
	
	private val _navigateToCharacterGallery = MutableLiveData<Boolean?>()
	
	
	val navigateToCharacterGallery: LiveData<Boolean?>
		get() = _navigateToCharacterGallery
	
	fun doneNavigating() {
		_navigateToCharacterGallery.value = null
	}
	
	fun onClose() {
		_navigateToCharacterGallery.value = true
	}
}