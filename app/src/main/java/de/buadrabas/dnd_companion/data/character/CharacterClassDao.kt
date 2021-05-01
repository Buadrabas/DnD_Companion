package de.buadrabas.dnd_companion.data.character

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CharacterClassDao {
	
	@Insert(onConflict = OnConflictStrategy.REPLACE)
	suspend fun insert(currentCharacter: CharacterClass)
	
	@Update
	suspend fun update(currentCharacter: CharacterClass)
	
	@Query("SELECT * from character_gallery WHERE characterId = :key")
	suspend fun get(key: Long): CharacterClass?
	
	@Query("DELETE FROM character_gallery")
	suspend fun clear()
	
	@Query("SELECT * FROM character_gallery ORDER BY characterId DESC LIMIT 1")
	suspend fun getCurrentCharacter(): CharacterClass?
	
	@Query("SELECT * FROM character_gallery ORDER BY characterId DESC")
	fun getCharacterList(): LiveData<List<CharacterClass>>
}