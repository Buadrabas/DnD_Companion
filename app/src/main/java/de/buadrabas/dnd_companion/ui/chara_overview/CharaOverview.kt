package de.buadrabas.dnd_companion.ui.chara_overview

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.floatingactionbutton.FloatingActionButton
import de.buadrabas.dnd_companion.R

class CharaOverview : Fragment() {

    private lateinit var charaOverviewModel: CharaOverviewModel

    override fun onCreateView(

            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        charaOverviewModel =
                ViewModelProvider(this).get(CharaOverviewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_chara_overview, container, false)
        val textView: TextView = root.findViewById(R.id.textOverview)
        charaOverviewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}