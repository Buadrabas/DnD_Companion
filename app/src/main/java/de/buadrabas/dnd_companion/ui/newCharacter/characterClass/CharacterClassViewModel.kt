package de.buadrabas.dnd_companion.ui.newCharacter.characterClass

import androidx.lifecycle.ViewModel
import de.buadrabas.dnd_companion.data.character.CharacterDescriptionDao

class CharacterClassViewModel( private val characterId: Long = 0L,
                               dataSource: CharacterDescriptionDao) : ViewModel()