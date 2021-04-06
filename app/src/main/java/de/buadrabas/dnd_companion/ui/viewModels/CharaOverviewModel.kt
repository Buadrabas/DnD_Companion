package de.buadrabas.dnd_companion.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import de.buadrabas.dnd_companion.data.character.CharacterClass

class CharaOverviewModel : ViewModel() {

    private val _characterList = MutableLiveData<CharacterClass>()
    val characterList: LiveData<CharacterClass> = _characterList

            init{
                loadCharacter()
            }

    fun loadCharacter(){
        _characterList.value = null
    }
}