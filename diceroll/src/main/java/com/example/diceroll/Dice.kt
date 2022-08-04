package com.example.diceroll

class Dice(val numside:Int) {

    fun roll():Int {
        return (1..numside).random()

    }
}