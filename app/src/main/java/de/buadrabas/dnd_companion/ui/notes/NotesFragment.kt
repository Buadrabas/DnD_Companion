package de.buadrabas.dnd_companion.ui.notes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.databinding.FragmentNotesListBinding

/**
 * A fragment representing a list of Items.
 */
class NotesFragment : Fragment() {
	
	private lateinit var binding: FragmentNotesListBinding
	private lateinit var viewModel: NotesViewModel
	
	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		viewModel = ViewModelProvider(this).get(NotesViewModel::class.java)
		binding = DataBindingUtil.inflate(inflater, R.layout.fragment_notes_list, container, false)
		binding.notesViewModel = viewModel
		binding.lifecycleOwner = viewLifecycleOwner
		return binding.root
	}
}