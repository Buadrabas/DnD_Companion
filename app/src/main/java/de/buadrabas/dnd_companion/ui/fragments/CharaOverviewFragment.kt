package de.buadrabas.dnd_companion.ui.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import de.buadrabas.dnd_companion.ui.viewModels.CharaOverviewViewModel
import de.buadrabas.dnd_companion.R

class CharaOverviewFragment : Fragment() {
	
	companion object {
		fun newInstance() =
			CharaOverviewFragment()
	}
	
	private lateinit var viewModel: CharaOverviewViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_chara_overview, container, false)
	}
	
	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProvider(this).get(CharaOverviewViewModel::class.java)
		// TODO: Use the ViewModel
	}
	
}