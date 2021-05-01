package de.buadrabas.dnd_companion.ui.newCharacter.characterBuilder

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import de.buadrabas.dnd_companion.R

class CharacterBuilderFragment : Fragment() {
	
	companion object {
		fun newInstance() = CharacterBuilderFragment()
	}
	
	private lateinit var viewModel: CharacterBuilderViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_character_builder, container, false)
	}
	
	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProvider(this).get(CharacterBuilderViewModel::class.java)
		// TODO: Use the ViewModel
	}
	
}