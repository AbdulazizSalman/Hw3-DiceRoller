package com.example.diceroll

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    // function
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Button_Roll: Button = findViewById(R.id.Button_Roll)


        Button_Roll.setOnClickListener {
            Roll_Dice()

        }
    }

    private fun Roll_Dice(){
        //new object
        val dice = Dice(6)
        // variable of image
        val Dice_Image: ImageView = findViewById(R.id.Dice_Image)
        //return random number
        val RandomNumber = dice.roll()

        when(RandomNumber){
            1 -> Dice_Image.setImageResource(R.drawable.dice_1)
            2 -> Dice_Image.setImageResource(R.drawable.dice_2)
            3 -> Dice_Image.setImageResource(R.drawable.dice_3)
            4 -> Dice_Image.setImageResource(R.drawable.dice_4)
            5 -> Dice_Image.setImageResource(R.drawable.dice_5)
            6 -> Dice_Image.setImageResource(R.drawable.dice_6)
        }


    }
}