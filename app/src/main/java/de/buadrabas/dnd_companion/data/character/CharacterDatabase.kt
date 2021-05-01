package de.buadrabas.dnd_companion.data.character

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [CharacterClass::class], version = 1, exportSchema = false)
abstract class CharacterDatabase : RoomDatabase() {
	
	abstract val characterClassDao: CharacterClassDao
	
	companion object {
		@Volatile
		private var INSTANCE: CharacterDatabase? = null
		
		fun getInstance(context: Context): CharacterDatabase {
			synchronized(this) {
				var instance = INSTANCE
				
				if (instance == null) {
					instance = Room.databaseBuilder(
						context.applicationContext, CharacterDatabase::class.java,
						"character_database"
					)
						.fallbackToDestructiveMigration()
						.build()
					INSTANCE = instance
				}
				return instance
			}
		}
		
	}
}