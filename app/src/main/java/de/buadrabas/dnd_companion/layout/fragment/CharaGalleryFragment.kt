package de.buadrabas.dnd_companion.layout.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import de.buadrabas.dnd_companion.R
import de.buadrabas.dnd_companion.viewModels.CharaGalleryViewModel

class CharaGalleryFragment : Fragment() {

    private lateinit var charaGalleryViewModel: CharaGalleryViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        charaGalleryViewModel =
                ViewModelProvider(this).get(CharaGalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_chara_gallery, container, false)
        return root
    }
}