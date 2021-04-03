package de.buadrabas.dnd_companion.activities

import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import de.buadrabas.dnd_companion.R

class CharaGalleryActivity:AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
		super.onCreate(savedInstanceState, persistentState)
	}
	
	val fab: View= findViewById(R.id.newCharacterButton)
	fab.setOnClickListener{View}
}