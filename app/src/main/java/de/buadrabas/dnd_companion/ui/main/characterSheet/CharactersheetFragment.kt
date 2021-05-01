package de.buadrabas.dnd_companion.ui.characterSheet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.data.character.CharacterDatabase
import de.buadrabas.dnd_companion.databinding.FragmentCharacterSheetBinding

class CharacterSheetFragment:Fragment(){
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		
		val binding: FragmentCharacterSheetBinding = DataBindingUtil.inflate(
			inflater, R.layout.fragment_character_sheet, container, false)
		
		val application = requireNotNull(this.activity).application
		val arguments = arguments?.let { CharacterSheetFragmentArgs.fromBundle(it) }
		
		val dataSource = CharacterDatabase.getInstance(application).characterClassDao
		val viewModelFactory =
			arguments?.let { CharacterSheetViewModelFactory(it.characterId, dataSource) }
		
		val characterSheetViewModel = viewModelFactory?.let {
			ViewModelProvider(this,
				it
			).get(CharacterSheetViewModel::class.java)
		}
		
		binding.characterSheetViewModel = characterSheetViewModel
		
		binding.setLifecycleOwner(this)
		
		characterSheetViewModel?.navigateToCharacterGallery?.observe(viewLifecycleOwner, Observer {
			if(it==true){
				this.findNavController().navigate(
					CharacterSheetFragmentDirections.actionNavCharacterSheetToNavCharaGallery()
				)
				characterSheetViewModel.doneNavigating()
			}
		})
		
		return binding.root
	}
}