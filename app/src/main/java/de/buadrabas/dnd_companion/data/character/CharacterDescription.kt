package de.buadrabas.dnd_companion.data.character

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.room.*

@Database(entities = [CharacterDescription::class], version = 1, exportSchema = false)
//@TypeConverters(Converter::class)
abstract class CharacterDatabase : RoomDatabase() {
	
	/**
	 * Connect the database to the DAO
	 */
	abstract val characterClassDao: CharacterDescriptionDao
	
	/**
	 * Define a companion object, this allows us to add functions on the CharacterDatabase class.
	 *
	 * For example, clients can call `CharacterDatabase.getInstance(context)` to instantiate
	 * a new CharacterDatabase.
	 */
	companion object {
		@Volatile
		private var INSTANCE: CharacterDatabase? = null
		
		
		/**
		 * Helper function to get the database.
		 *
		 * If a database has already been retrieved, the previous database will be returned.
		 * Otherwise, create a new database.
		 *
		 * This function is threadsafe, and callers should cache the result for multiple database
		 * calls to avoid overhead.
		 *
		 * This is an example of a simple Singleton pattern that takes another Singleton as an
		 * argument in Kotlin.
		 *
		 * To learn more about Singleton read the wikipedia article:
		 * https://en.wikipedia.org/wiki/Singleton_pattern
		 *
		 * @param context The application context Singleton, used to get access to the filesystem.
		 */
		fun getInstance(context: Context): CharacterDatabase {
			// Multiple threads can ask for the database at the same time, ensure we only initialize
			// it once by using synchronized. Only one thread may enter a synchronized block at a
			// time.
			synchronized(this) {
				var instance = INSTANCE
				
				// If instance is `null` make a new database instance.
				if (instance == null) {
					instance = Room.databaseBuilder(
						context.applicationContext, CharacterDatabase::class.java,
						"character_database"
					)
						.fallbackToDestructiveMigration()
						.build()
					// Assign INSTANCE to the new database
					INSTANCE = instance
				}
				// Return instance; smart cast to be non-null.
				return instance
			}
		}
		
	}
}

@Dao
interface CharacterDescriptionDao {
	
	@Insert
	suspend fun insert(currentCharacter: CharacterDescription): Long
	
	@Delete
	fun delete(currentCharacter: CharacterDescription)
	
	@Update
	suspend fun update(currentCharacter: CharacterDescription)

//	@Query("SELECT * from character_gallery WHERE character_id = :key")
//	suspend fun get(key: Long): CharacterDescription?
	
	@Query("SELECT * FROM character_gallery ORDER BY character_id DESC LIMIT 1")
	suspend fun getCurrentCharacter(): CharacterDescription?
	
	@Query("SELECT * FROM character_gallery ORDER BY character_id DESC")
	fun getCharacterList(): LiveData<List<CharacterDescription>>
	
	@Query("SELECT * from character_gallery WHERE character_id = :key")
	fun getCharacterWithId(key: Long): LiveData<CharacterDescription>
}

@Entity(tableName = "character_gallery")
data class CharacterDescription(
	
	@PrimaryKey(autoGenerate = true)
	@ColumnInfo(name = "character_id")
	var characterId: Long = 0L,
	
	@ColumnInfo(name = "fullName")
	val fullName: String = "",
	
	@ColumnInfo(name = "playerName")
	var playerName: String = "",
)
//	@ColumnInfo(name = "classList")
//	var classList: MutableList<Int>,

//	@Embedded
//	var race: CharacterRace,
// @ColumnInfo(name = "Age")
// var age: Int = 0,
//
// //	@Embedded
// //	var alignment: Alignment,
//
// @ColumnInfo(name = "Deity")
// var deity: String = "",
//
// @ColumnInfo(name = "Religion")
// var religion: String = "",
//
// @ColumnInfo(name = "Height")
// var height: Int = 0,
//
// @ColumnInfo(name = "Weight")
// var weight: Int = 0,
//
// //	@Embedded
// //	var vision: Vision,
//
// @ColumnInfo(name = "ExpPoints")
// var expPoints: Int = 0,
//
// //	@Embedded
// //	var gender: Gender = de.buadrabas.dnd_companion.data.character.Gender.MALE,
//
// @ColumnInfo(name = "EyeColor")
// var eyes: String = "",
//
// @ColumnInfo(name = "HairColor")
// var hair: String = "",
//
// @ColumnInfo(name = "HitpointsMax")
// var hitpointsMax: Int = 0,
//
// @ColumnInfo(name = "HitpointsCur")
// var hitpointsCur: Int = 0,
//
// @ColumnInfo(name = "armorClass")
// var armorClass: Int = 0,
//
// @ColumnInfo(name = "Speed in fields")
// var speed: Int = 0,
//
// @ColumnInfo(name = "DamageReduction")
// var DR: Int = 0,
//
// @ColumnInfo(name = "Initiative")
// var Initiative: Int = 0,
//
// //	@ColumnInfo(name = "languages")
// //	var languages: List<String>,
//
// @ColumnInfo(name = "Biography")
// var biography: String = ""
//
// /*	@Embedded
// var abilities: Ability,*/
//
// //	@ColumnInfo(name = "characterPicture")
// //	var characterPicture: Int = R.drawable.ic_launcher_foreground,
//
// //	@Embedded
// //	var skillList: SkillClass,
//
// //	@Embedded
// //	var FeatList: Feats
// )
//
// /*
// class Converter {
// @TypeConverter
// fun fromAlignmentToString(value: Alignment) = value.name
//
// @TypeConverter
// fun fromStringToAlignment(value: String) = enumValueOf<Alignment>(value)
//
// @TypeConverter
// fun fromRaceToString(value: CharacterRace) = value.RaceName
//
// @TypeConverter
// fun fromStringToRace(value: String): CharacterRace {
// var race: CharacterRace = Human()
// when (value) {
// "Human" -> race = Human()
// else -> Human()
// }
// return race
// }
//
// @TypeConverter
// fun fromGenderTOString(value: Gender) = value.name
//
// @TypeConverter
// fun fromStringToGender(value: String) = enumValueOf<Gender>(value)
// }
//
// /*
// enum class Alignment(var alignment: String) {
// GOOD_LAWFUL("Lawful Good"),
// GOOD_NEUTRAL("Neutral Good"),
// GOOD_CHAOTIC("Chaotic Good"),
// NEUTRAL_LAWFUL("Lawful Neutral"),
// NEUTRAL("Neutral"),
// NEUTRAL_CHAOTIC("Chaotic Neutral"),
// EVIL_LAWFUL("Lawful Evil"),
// EVIL_NEUTRAL("Neutral Evil"),
// EVIL_CHAOTIC("Chaotic Evil"),
// ERROR("Not a Alignment")
// }
// /*
// enum class Gender(var gender: String) {
// MALE("Male"),
// FEMALE("Female")
// }
//

 data class Ability(
 var strength: Int = 0,
 var dextery: Int = 0,
 var constituion: Int = 0,
 var intelligence: Int = 0,
 var wisdom: Int = 0,
 var charisma: Int = 0
 )