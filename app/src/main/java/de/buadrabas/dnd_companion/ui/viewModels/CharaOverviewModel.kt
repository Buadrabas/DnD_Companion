package de.buadrabas.dnd_companion.ui.viewModels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import de.buadrabas.dnd_companion.data.CharaDataClass

class CharaOverviewModel : ViewModel() {

    private val _characterList = MutableLiveData<CharaDataClass>()
    val characterList: LiveData<CharaDataClass> = _characterList

            init{
                loadCharacter()
            }

    fun loadCharacter(){
        _characterList.value = null
    }
}