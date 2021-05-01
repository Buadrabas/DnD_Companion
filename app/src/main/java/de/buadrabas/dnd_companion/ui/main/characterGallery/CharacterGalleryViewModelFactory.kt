package de.buadrabas.dnd_companion.ui.characterGallery

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import de.buadrabas.dnd_companion.data.character.CharacterDescriptionDao

class CharacterGalleryViewModelFactory(
	private val dataSource: CharacterDescriptionDao,
	private  val application: Application): ViewModelProvider.Factory {
	@Suppress("unchecked_cast")
	override fun <T : ViewModel?> create(modelClass: Class<T>): T {
		if(modelClass.isAssignableFrom(CharacterGalleryViewModel::class.java)){
			return CharacterGalleryViewModel(dataSource, application) as T
		}
		throw IllegalArgumentException("Unknown ViewModel class")
	}
}