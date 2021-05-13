package de.buadrabas.dnd_companion.ui.main.characterStatsOverview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import de.buadrabas.dnd_companion.R

class CharacterStatsOverViewFragment : Fragment() {
	
	companion object {
		fun newInstance() = CharacterStatsOverViewFragment()
	}
	
	private lateinit var viewModel: CharacterStatsOverViewViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_character_sheet_over_view, container, false)
	}
	
}