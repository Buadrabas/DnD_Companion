package de.buadrabas.dnd_companion.data.character

import android.telephony.ims.ImsMmTelManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.buadrabas.dnd_companion.R

class CharacterAdapter : RecyclerView.Adapter<CharacterAdapter.ViewHolder>() {
	
	var data = listOf<CharacterClass>()
		set(value) {
			field = value
			notifyDataSetChanged()
		}
	
	override fun getItemCount() = data.size
	
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		val item = data[position]
		holder.bind(item)
	}
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		return ViewHolder.from(parent)
	}
	
	class ViewHolder private constructor(itemView: View) : RecyclerView.ViewHolder(itemView) {
		
		val characterName: TextView = itemView.findViewById(R.id.characterName)
		val characterClass: TextView = itemView.findViewById(R.id.characterClass)
		val characterRace: TextView = itemView.findViewById(R.id.characterRace)
		val characterPicture: ImageView = itemView.findViewById(R.id.characterPicture)
		
		fun bind(item: CharacterClass) {
			val res = itemView.context.resources
			characterName.text = item.fullName
			characterClass.text = item.classes.toString()
			characterRace.text = item.race.toString()
			characterPicture.setImageResource(when (item.characterPicture){
				else -> R.drawable.ic_menu_character
			})
			
			
		}
		
		companion object {
			fun from(parent: ViewGroup): ViewHolder {
				val layoutInflater = LayoutInflater.from(parent.context)
				val view = layoutInflater.inflate(R.layout.list_chara_fields, parent, false)
				
				return ViewHolder(view)
			}
		}
	}
	
	
}