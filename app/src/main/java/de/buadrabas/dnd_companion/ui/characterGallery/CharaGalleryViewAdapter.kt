package de.buadrabas.dnd_companion.ui.characterGallery

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.data.character.characterClass

class CharaGalleryViewAdapter(
	private val context: Context,
	private val charactercards: List<characterClass>
) : RecyclerView.Adapter<CharaGalleryViewAdapter.CharacterCardViewHolder>() {
	
	class CharacterCardViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
		val charaName: TextView = view.findViewById(R.id.characterName)
		val charaClass: TextView = view.findViewById(R.id.characterClass)
		val charaRace: TextView = view.findViewById(R.id.characterRace)
		val charaPicture: ImageView = view.findViewById(R.id.charaPicture)
	}
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharacterCardViewHolder {
		val adapterLayout = LayoutInflater.from(parent.context)
			.inflate(R.layout.list_chara_fields, parent, false)
		
		return CharacterCardViewHolder(adapterLayout)
	}
	
	override fun onBindViewHolder(holder: CharacterCardViewHolder, position: Int) {
		val item = charactercards[position]
		holder.charaName.text = item.firstName
		holder.charaClass.text = item.classes.toString()
		holder.charaRace.text = item.race.RaceName
		holder.charaPicture.setImageResource(item.characterPicture)
		
	}
	
	override fun getItemCount() = charactercards.size
	
	
}