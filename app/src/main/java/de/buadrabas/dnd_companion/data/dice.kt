package de.buadrabas.dnd_companion.data

class Dice(private val numSides: Int) {
 fun roll():Int {
 	return (1..numSides).random()
 }
}