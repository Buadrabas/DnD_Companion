package de.buadrabas.dnd_companion.ui.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import de.buadrabas.dnd_companion.data.Dice

class DicePoolViewModel : ViewModel() {

	private val _text = MutableLiveData<String>().apply {
		value = "This is the Dice Pool"
	}
	
	private val dicePool = MutableLiveData<Dice>().apply {
		value = Dice(6)
	}
	
	var text = _text
}