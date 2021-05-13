package de.buadrabas.dnd_companion.ui.main.characterSheetAbilities

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import de.buadrabas.dnd_companion.R

class CharacterSheetAbilitiesFragment : Fragment() {
	
	companion object {
		fun newInstance() = CharacterSheetAbilitiesFragment()
	}
	
	private lateinit var viewModel: CharacterSheetAbilitiesViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_character_sheet_abilities, container, false)
	}
	
}