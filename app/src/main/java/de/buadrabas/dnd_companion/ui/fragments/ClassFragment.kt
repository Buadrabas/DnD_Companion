package de.buadrabas.dnd_companion.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import de.buadrabas.dnd_companion.ui.viewAdapter.MyClassRecyclerViewAdapter
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.dummy.DummyContent

/**
 * A fragment representing a list of Items.
 */
class ClassFragment : Fragment() {
	
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
		
		// Set the adapter
		if (view is RecyclerView) {
			with(view) {
				layoutManager = when {
					columnCount <= 1 -> LinearLayoutManager(context)
					else -> GridLayoutManager(context, columnCount)
				}
				adapter = MyClassRecyclerViewAdapter(DummyContent.ITEMS)
			}
		}
		return view
	}
	
	companion object {
		
		// TODO: Customize parameter argument names
		const val ARG_COLUMN_COUNT = "column-count"
		
		// TODO: Customize parameter initialization
		@JvmStatic
		fun newInstance(columnCount: Int) =
			ClassFragment().apply {
				arguments = Bundle().apply {
					putInt(ARG_COLUMN_COUNT, columnCount)
				}
			}
	}
}