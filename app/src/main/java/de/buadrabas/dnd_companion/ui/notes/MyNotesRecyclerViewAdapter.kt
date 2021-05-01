package de.buadrabas.dnd_companion.ui.notes

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.data.notes


/**
 * [RecyclerView.Adapter] that can display a [DummyItem].
 * TODO: Replace the implementation with code for your data type.
 */
class MyNotesRecyclerViewAdapter(
	private val values: List<notes>
) : RecyclerView.Adapter<MyNotesRecyclerViewAdapter.ViewHolder>() {
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		val view = LayoutInflater.from(parent.context)
			.inflate(R.layout.list_notes_fields, parent, false)
		return ViewHolder(view)
	}
	
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		val item = values[position]
	}
	
	override fun getItemCount(): Int = values.size
	
	inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
		val idView: TextView = view.findViewById(R.id.item_number)
		val contentView: TextView = view.findViewById(R.id.content)
		
		override fun toString(): String {
			return super.toString() + " '" + contentView.text + "'"
		}
	}
}