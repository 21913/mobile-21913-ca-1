package com.taianesilva.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addTwoNumbers()

    }

    private fun addTwoNumbers() {

        val numberOne = findViewById<EditText>(R.id.number_one) //to enter with the 1st number
        val numberTwo = findViewById<EditText>(R.id.number_two) // to enter with the 2nd number
        val result = findViewById<TextView>(R.id.final_result) // to give the result
        val button = findViewById<Button>(R.id.button_ok) // to get the result

        button.setOnClickListener {

            result.text = (numberOne.text.toString().toDouble() +  + numberTwo.text.toString().toDouble()).toString()
            Toast.makeText(this, result.text, Toast.LENGTH_LONG).show()

        }


    }
}