package de.buadrabas.dnd_companion.ui.main.characterSheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.data.character.CharacterDatabase
import de.buadrabas.dnd_companion.databinding.FragmentCharacterSheetBinding


class CharacterSheetFragment : Fragment() {
	
	companion object {
		/**
		 * The fragment argument representing the section number for this
		 * fragment.
		 */
		private const val ARG_SECTION_NUMBER = "section_number"
		
		/**
		 * Returns a new instance of this fragment for the given section
		 * number.
		 */
		@JvmStatic
		fun newInstance(sectionNumber: Int): CharacterSheetFragment {
			return CharacterSheetFragment().apply {
				arguments = Bundle().apply {
					putInt(ARG_SECTION_NUMBER, sectionNumber)
				}
			}
		}
	}
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		
		val binding: FragmentCharacterSheetBinding = DataBindingUtil.inflate(
			inflater, R.layout.fragment_character_sheet, container, false
		)
		
		val application = requireNotNull(this.activity).application
		val arguments = arguments?.let { CharacterSheetFragmentArgs.fromBundle(it) }
		
		val dataSource = CharacterDatabase.getInstance(application).characterClassDao
		val viewModelFactory =
			arguments?.let { CharacterSheetViewModelFactory(it.characterId, dataSource) }
		
		val characterSheetViewModel = viewModelFactory?.let {
			ViewModelProvider(
				this,
				it
			).get(CharacterSheetViewModel::class.java)
		}
		
		
		binding.characterSheetViewModel = characterSheetViewModel
		
		binding.lifecycleOwner = this
		
		binding.tabs.tabMode = TabLayout.MODE_SCROLLABLE
		binding.tabs.isInlineLabel = true
		binding.viewPager.adapter =
			TabsPagerAdapter(parentFragmentManager, lifecycle, 2)
		binding.viewPager.isUserInputEnabled = true
		
		TabLayoutMediator(binding.tabs, binding.viewPager) { tab, position ->
			when (position) {
				0 -> {
					tab.text = "Overview"
				}
				1 -> {
					tab.text = "Abilities"
				}
			}
		}
		
		characterSheetViewModel?.navigateToCharacterGallery?.observe(viewLifecycleOwner, Observer {
			if (it == true) {
				this.findNavController().navigate(
					CharacterSheetFragmentDirections.actionNavCharacterSheetToNavCharaGallery()
				)
				characterSheetViewModel.doneNavigating()
			}
		})
		
		return binding.root
	}
	
}
