package de.buadrabas.dnd_companion.ui.characterSheet

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import de.buadrabas.dnd_companion.data.character.characterClass

class CharacterSheetViewModel : ViewModel() {
	
	private val _characterList = MutableLiveData<characterClass>()
	val characterList: LiveData<characterClass> = _characterList
	
	init {
		loadCharacter()
	}
	
	fun loadCharacter() {
		_characterList.value = null
	}
}