package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var diceImage: ImageView //this assures compiler that var wil be initialised in onCreate before being used in program

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_button: Button = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.dice_image)
        roll_button.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        var randomNum = Random().nextInt(6)+1 //import java util lib
        var selectedDrawable = when (randomNum){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(selectedDrawable)
        //textView.text = randomNum.toString() //set text in kotlin

    }
}
