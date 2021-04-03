package de.buadrabas.dnd_companion.data

interface CharacterRace{
    val AttributeAdjustment: Array<Int>
    val RacialTraits: Array<String>
    val FavoredClass: Array<String>
    val Size: Int // Size are from
}

class HumanRace(): CharacterClass() {
 val AttributeAdjustment = null
 val RacialTraits =
}

/**
 * Need Class for Size with 3 Fields: Creature Size, Space, Natural Reach
 */

data class Size(var Size: Int){
    val Fine: Int = 0 // Fly 1/2 ft. 0
    Diminutive Toad 1 ft. 0
    Tiny Cat 2-1/2 ft. 0
    Small Halfling 5 ft. 5 ft.
    Medium Human 5 ft. 5 ft.
    Large (tall) Ogre 10 ft. 10 ft.
    Large (long) Horse 10 ft. 5 ft.
    Huge (tall) Cloud giant 15 ft. 15 ft.
    Huge (long) Bulette 15 ft. 10 ft.
    Gargantuan (tall) 50-ft. animated 20 ft. 20 ft.
    statue
    Gargantuan (long) Kraken 20 ft. 15 ft.
    Colossal (tall) Colossal animated 30 ft. 30 ft.
    object or more or more
    Colossal (long) Great wyrm 30 ft. 20 ft.
    red dragon or more or more
}