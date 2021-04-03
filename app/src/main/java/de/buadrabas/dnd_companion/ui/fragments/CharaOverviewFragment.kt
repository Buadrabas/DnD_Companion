package de.buadrabas.dnd_companion.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.databinding.FragmentCharaOverviewBinding
import de.buadrabas.dnd_companion.ui.viewModels.CharaOverviewModel

/**
 * [CharaOverviewFragment] shows a list with all created characters
 */

class CharaOverviewFragment : Fragment(){

    private var binding: FragmentCharaOverviewBinding? = null

    private val sharedViewModel: CharaOverviewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val fragmentBinding = FragmentCharaOverviewBinding.inflate(inflater, container, false)
        binding = fragmentBinding
       return fragmentBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding?.apply {
            lifecycleOwner = viewLifecycleOwner
            hasCharacters = false

        }
    }

    /**
     * Open the [fragment_chara_builder.xml] and start the procedure for a new character
     */
    fun newChara(){

    }
}