package de.buadrabas.dnd_companion.ui.newCharacter.characterClass

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import de.buadrabas.dnd_companion.R

/**
 * A fragment representing a list of Items.
 */
class CharacterClassFragment : Fragment() {
	
	private var columnCount = 1
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		
		arguments?.let {
			columnCount = it.getInt(ARG_COLUMN_COUNT)
		}
	}
	
	override fun onCreateView(
		inflater: LayoutInflater, container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val view = inflater.inflate(R.layout.fragment_choose_class_list, container, false)
		return view
	}
	
	companion object {
		
		// TODO: Customize parameter argument names
		const val ARG_COLUMN_COUNT = "column-count"
		
		// TODO: Customize parameter initialization
		@JvmStatic
		fun newInstance(columnCount: Int) =
			CharacterClassFragment().apply {
				arguments = Bundle().apply {
					putInt(ARG_COLUMN_COUNT, columnCount)
				}
			}
	}
}