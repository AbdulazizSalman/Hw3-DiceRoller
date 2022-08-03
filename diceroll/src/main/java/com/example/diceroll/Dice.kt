package com.example.diceroll

class Dice(val numsides:Int) {

    fun roll():Int {
     return (1..numsides).random()

    }
}