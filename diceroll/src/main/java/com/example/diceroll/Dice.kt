package com.example.diceroll

class Dice(val numside0:Int) {

    fun roll():Int {
        return (1..numside0).random()

    }
}