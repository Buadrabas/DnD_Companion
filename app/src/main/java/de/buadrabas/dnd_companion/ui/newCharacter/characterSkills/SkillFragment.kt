package de.buadrabas.dnd_companion.ui.newCharacter.characterSkills

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import de.buadrabas.dnd_companion.R

class SkillFragment : Fragment() {
	
	companion object {
		fun newInstance() =
			SkillFragment()
	}
	
	private lateinit var viewModel: SkillViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		return inflater.inflate(R.layout.fragment_skill_list, container, false)
	}
	
	override fun onActivityCreated(savedInstanceState: Bundle?) {
		super.onActivityCreated(savedInstanceState)
		viewModel = ViewModelProvider(this).get(SkillViewModel::class.java)
		// TODO: Use the ViewModel
	}
	
}