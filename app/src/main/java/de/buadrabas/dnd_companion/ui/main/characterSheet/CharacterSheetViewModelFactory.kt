package de.buadrabas.dnd_companion.ui.main.characterSheet

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import de.buadrabas.dnd_companion.data.character.CharacterDescriptionDao

class CharacterSheetViewModelFactory(
	private val characterId: Long,
	private val dataSource: CharacterDescriptionDao
) : ViewModelProvider.Factory {
	@Suppress("unchecked cast")
	override fun <T : ViewModel?> create(modelClass: Class<T>): T {
		if (modelClass.isAssignableFrom(CharacterSheetViewModel::class.java)) {
			return CharacterSheetViewModel(characterId, dataSource) as T
		}
		throw IllegalArgumentException("Unknown ViewModel class")
	}
}