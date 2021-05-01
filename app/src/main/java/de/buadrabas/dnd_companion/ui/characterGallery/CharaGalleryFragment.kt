package de.buadrabas.dnd_companion.ui.characterGallery

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil.inflate
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.room.Database
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.activities.CreateNewCharacterActivity
import de.buadrabas.dnd_companion.databinding.FragmentCharaGalleryBinding

class CharaGalleryFragment : Fragment() {
	
	private lateinit var binding: FragmentCharaGalleryBinding
	private lateinit var viewModel: CharaGalleryViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		viewModel = ViewModelProvider(this).get(CharaGalleryViewModel::class.java)
		binding = inflate(inflater, R.layout.fragment_chara_gallery, container, false)
		binding.charaGalleryViewModel = viewModel
		binding.lifecycleOwner = viewLifecycleOwner
		return binding.root
	}
	
	
	fun createNewCharacter(){
		val intent= Intent(activity, CreateNewCharacterActivity::class.java)
		startActivity(intent)
	}
}