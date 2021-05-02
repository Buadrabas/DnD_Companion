package de.buadrabas.dnd_companion.ui.main.characterGallery

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import de.buadrabas.dnd_companion.data.character.CharacterDescription
import de.buadrabas.dnd_companion.databinding.ListCharaFieldsBinding


private const val ITEM_VIEW_TYPE_ITEM = 1

class CharacterGalleryAdapter(private val clickListener: NewCharacterListener) :
	ListAdapter<CharacterDescription, CharacterGalleryAdapter.ViewHolder>(
		CharacterDiffCallback()
	) {
	
	override fun onBindViewHolder(holder: ViewHolder, position: Int) {
		holder.bind(getItem(position)!!, clickListener)
	}
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
		return ViewHolder.from(parent)
	}
	
	class ViewHolder private constructor(val binding: ListCharaFieldsBinding) :
		RecyclerView.ViewHolder(binding.root) {
		
		fun bind(item: CharacterDescription, clickListener: NewCharacterListener) {
			binding.chooseCharacter = item
			binding.clickListener = clickListener
			binding.executePendingBindings()
		}
		
		companion object {
			fun from(parent: ViewGroup): ViewHolder {
				val layoutInflater = LayoutInflater.from(parent.context)
				val binding = ListCharaFieldsBinding.inflate(layoutInflater, parent, false)
				return ViewHolder(binding)
			}
		}
	}
}

class CharacterDiffCallback : DiffUtil.ItemCallback<CharacterDescription>() {
	
	override fun areItemsTheSame(oldItem: CharacterDescription, newItem: CharacterDescription): Boolean {
		return oldItem.characterId == newItem.characterId
	}
	
	override fun areContentsTheSame(oldItem: CharacterDescription, newItem: CharacterDescription): Boolean {
		return oldItem == newItem
	}
}

class NewCharacterListener(val clickListener: (sleepId: Long) -> Unit) {
	fun onClick(character: CharacterDescription) = clickListener(character.characterId)
}