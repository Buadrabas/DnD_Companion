package de.buadrabas.dnd_companion.data.character

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.*

data class SkillClass(
	val skillId: Int = 0,
	val skillName: String = " ",
	val keyStat: Int = 0,
	val untrainedUsage: Boolean = false,
	val skillPenality: Int = 0,
	val skillDescription: String =" ",
	var skillRank: Int = 0,
	var skillBonus: Int = 0
)