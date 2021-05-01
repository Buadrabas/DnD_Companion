package de.buadrabas.dnd_companion.ui.characterGallery

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import de.buadrabas.dnd_companion.data.character.CharacterDescription
import de.buadrabas.dnd_companion.databinding.ListCharaFieldsBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

private const val ITEM_VIEW_TYPE_ITEM = 1

class CharaGalleryAdapter(val clickListener: NewCharacterListener) :
	androidx.recyclerview.widget.ListAdapter<DataItem, RecyclerView.ViewHolder>(
		CharacterDiffCallback()
	) {
	
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
	
	private val adapterScope = CoroutineScope(Dispatchers.Default)
	
	fun addHeaderandSubmitList(list: List<CharacterDescription>?) {
		adapterScope.launch {
			val items = when (list) {
				null -> listOf(DataItem.Header)
				else -> listOf(DataItem.Header) + list.map { DataItem.CharacterItem(it) }
			}
		}
	}
	
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
		return when (viewType) {
			ITEM_VIEW_TYPE_ITEM -> ViewHolder.from(parent)
			else -> throw ClassCastException("Unknown viewType ${viewType}")
		}
	}
	
	override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
		when (holder) {
			is ViewHolder -> {
				val character = getItem(position) as DataItem.CharacterItem
				holder.bind(character.character, clickListener)
			}
		}
	}
}

class CharacterDiffCallback : DiffUtil.ItemCallback<DataItem>() {
	override fun areItemsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
		return oldItem.id == newItem.id
	}
	
	@SuppressLint("DiffUtilEquals")
	override fun areContentsTheSame(oldItem: DataItem, newItem: DataItem): Boolean {
		return oldItem == newItem
	}
}

class NewCharacterListener(val clickListener: (characterId: Long) -> Unit) {
	fun onClick(chara: CharacterDescription) = clickListener(chara.characterId)
}

sealed class DataItem {
	data class CharacterItem(val character: CharacterDescription) : DataItem() {
		override val id = character.characterId
	}
	
	object Header : DataItem() {
		override val id = Long.MIN_VALUE
	}
	
	abstract val id: Long
}