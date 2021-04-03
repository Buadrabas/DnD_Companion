package de.buadrabas.dnd_companion.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData


class CharaDataClass() {
    private val _name  = MutableLiveData<String>()
    val name: LiveData<String> = _name

    var _strength : Int = 10
    var _Dextery : Int = 10
    var _strength : Int = 10
    var _strength : Int = 10
    var _strength : Int = 10
    var _alignment: Alignment

    var CharacterClass: CharacterClass


     fun setName(charaName: String){
         _name.value = charaName
     }


}

enum class Alignment{

    val Lawful_Good: String = "Lawful Good",
    val Lawful_Neutral: String = "Neutral Lawful",
    val Lawful_Evil: String = "Evil Lawful",
    val Neutral_Good: String = "Good Neutral",
    val Neutral: String = "Neutral",
    val  Neutral_Evil: String = "Neutral Evil",
    val Chaotic_Good: String = "Chaotic  Good",
    val Chaotic_Neutral: String = "Chaotic Neutral",
    val Chaotic_Evil: String = "Chaotic Lawful"
}