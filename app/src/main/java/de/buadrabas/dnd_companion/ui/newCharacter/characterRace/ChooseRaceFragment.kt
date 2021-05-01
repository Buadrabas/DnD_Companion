package de.buadrabas.dnd_companion.ui.newCharacter.characterRace

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import de.buadrabas.dnd_companion.R

class ChooseRaceFragment : Fragment() {
	
	companion object {
		fun newInstance() = ChooseRaceFragment()
	}
	
	private lateinit var viewModel: ChooseRaceViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_choose_race, container, false)
	}
	
	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProvider(this).get(ChooseRaceViewModel::class.java)
		// TODO: Use the ViewModel
	}
	
}