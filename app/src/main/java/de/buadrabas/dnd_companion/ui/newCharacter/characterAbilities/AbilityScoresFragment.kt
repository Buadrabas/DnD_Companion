package de.buadrabas.dnd_companion.ui.newCharacter.characterAbilities

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.buadrabas.dnd_companion.databinding.FragmentAbilityScoresBinding

/**
 * A fragment representing a list of Items.
 */
class AbilityScoresFragment : Fragment() {
	
	private var _binding: FragmentAbilityScoresBinding? = null
	
	private val binding get() = _binding!!
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		_binding = FragmentAbilityScoresBinding.inflate(inflater, container, false)
		return binding.root
	}
	
}