package de.buadrabas.dnd_companion.ui.dice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.databinding.FragmentDicePoolBinding

class DicePoolFragment : Fragment() {
	
	private lateinit var binding: FragmentDicePoolBinding
	private lateinit var viewModel: DicePoolViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		viewModel = ViewModelProvider(this).get(DicePoolViewModel::class.java)
		binding = inflate(inflater, R.layout.fragment_dice_pool, container, false)
		binding.dicePoolViewModel = viewModel
		binding.lifecycleOwner = viewLifecycleOwner
		return binding.root
	}
}