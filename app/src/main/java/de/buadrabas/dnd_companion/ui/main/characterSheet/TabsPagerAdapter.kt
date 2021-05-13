package de.buadrabas.dnd_companion.ui.main.characterSheet

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import de.buadrabas.dnd_companion.ui.main.characterSheetAbilities.CharacterSheetAbilitiesFragment
import de.buadrabas.dnd_companion.ui.main.characterStatsOverview.CharacterStatsOverViewFragment

class TabsPagerAdapter(fm: FragmentManager, lifecycle: Lifecycle, private var numberOfTabs: Int) : FragmentStateAdapter(fm, lifecycle) {
	
	override fun createFragment(position: Int): Fragment {
		when (position) {
			0 -> {
				// # Overview Fragment
				val bundle = Bundle()
				val overviewModelFragment = CharacterStatsOverViewFragment()
				overviewModelFragment.arguments = bundle
				return overviewModelFragment
			}
			1 -> {
				// # Abilities Fragment
				val bundle = Bundle()
				bundle.putString("fragmentName", "Movies Fragment")
				val abilityFragment = CharacterSheetAbilitiesFragment()
				abilityFragment.arguments = bundle
				return abilityFragment
			}
			else -> return CharacterStatsOverViewFragment()
		}
	}
	
	override fun getItemCount(): Int {
		return numberOfTabs
	}
}