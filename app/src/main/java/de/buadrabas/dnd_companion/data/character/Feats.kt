package de.buadrabas.dnd_companion.data.character

import androidx.room.Entity
import androidx.room.PrimaryKey

//@Entity
data class Feats(
	//@PrimaryKey
	val featId: Int,
	val featName: String
)