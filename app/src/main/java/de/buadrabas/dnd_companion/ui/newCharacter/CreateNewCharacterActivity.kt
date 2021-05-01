package de.buadrabas.dnd_companion.ui.newCharacter

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import de.buadrabas.dnd_companion.R

class CreateNewCharacterActivity : AppCompatActivity()  {
	
	companion object{
		fun start(context: Context, launchIntent: Intent? = null){
			val intent = Intent(context, CreateNewCharacterActivity::class.java)
			launchIntent?.let{
				intent.data = it.data
				intent.putExtras(it)
			}
			context.startActivity(intent)
		}
	}
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_create_new)
	}
}