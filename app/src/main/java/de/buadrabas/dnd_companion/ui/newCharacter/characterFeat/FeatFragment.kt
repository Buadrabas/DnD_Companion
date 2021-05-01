package de.buadrabas.dnd_companion.ui.newCharacter.characterFeat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import de.buadrabas.dnd_companion.R

class FeatFragment : Fragment() {
	
	companion object {
		fun newInstance() =
			FeatFragment()
	}
	
	private lateinit var viewModel: FeatViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_feat_list, container, false)
	}
	
	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProvider(this).get(FeatViewModel::class.java)
		// TODO: Use the ViewModel
	}
	
}