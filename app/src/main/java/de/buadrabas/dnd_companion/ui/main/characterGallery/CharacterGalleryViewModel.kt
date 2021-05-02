package de.buadrabas.dnd_companion.ui.main.characterGallery


import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import de.buadrabas.dnd_companion.data.character.CharacterDescription
import de.buadrabas.dnd_companion.data.character.CharacterDescriptionDao
import kotlinx.coroutines.launch

class CharacterGalleryViewModel(dataSource: CharacterDescriptionDao, application: Application) :
	ViewModel() {
	
	/**
	 * Hold a reference to the CharacterDatabase via the DAO
	 */
	
	private val database = dataSource
	
	private var currentCharacter = MutableLiveData<CharacterDescription?>()
	
	val allCharacters = database.getCharacterList()
	
	private val _navigateToCharacterDetail = MutableLiveData<Long?>()
	val navigateToCharacterDetails
		get() = _navigateToCharacterDetail
	
	private val _navigateToNewCharacter = MutableLiveData<CharacterDescription?>()
	val navigateToNewCharacter
		get() = _navigateToNewCharacter
	
	fun onCharacterDetailClicked(id: Long) {
		_navigateToCharacterDetail.value = id
	}
	
	fun onCharacterDetailNavigated() {
		_navigateToCharacterDetail.value = null
	}
	
	fun onNewCharacterClicked(character: CharacterDescription) {
		_navigateToNewCharacter.value = character
	}
	
	fun onNewCharacterNavigated() {
		_navigateToNewCharacter.value = null
	}
	
	/**
	 * Converted Character to List for displaying them
	 */
	
	init {
		initializeCharacter()
	}
	
	private fun initializeCharacter() {
		viewModelScope.launch { currentCharacter.value = getCurrentCharacterFromDatabase() }
	}
	
	private suspend fun getCurrentCharacterFromDatabase(): CharacterDescription? {
		return database.getCurrentCharacter()
	}
	
	private suspend fun insert(characterClass: CharacterDescription) {
		database.insert(characterClass)
	}
	
	private suspend fun update(characterClass: CharacterDescription) {
		database.update(characterClass)
	}
	
	private suspend fun delete(characterClass: CharacterDescription) {
		database.delete(characterClass)
	}
	
	fun onNewCharacter() {
		viewModelScope.launch {
			val newCharacter = CharacterDescription()
			insert(newCharacter)
			_navigateToNewCharacter.value = newCharacter
		}
	}
	
	fun onCharacterClicked(characterId: Long) {
		viewModelScope.launch {
			_navigateToCharacterDetail.value = characterId
		}
	}
}