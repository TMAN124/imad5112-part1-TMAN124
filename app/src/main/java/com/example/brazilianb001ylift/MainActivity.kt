package com.example.brazilianb001ylift

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateHistoryButton = findViewById<Button>(R.id.searchButton)

        val editText = findViewById<EditText>(R.id.editTextNumber)

        val textView = findViewById<TextView>(R.id.textView2)


        generateHistoryButton?.setOnClickListener {
            val inputText = editText.text.toString()


            if (inputText.isNotEmpty() && inputText.all { it.isDigit() }) {

                var inputNumber = inputText.toInt()




                if (inputNumber >= 20 && inputNumber < 100) {

                    if (inputNumber == 42) {

                        textView.text = "Elvis Presley died at the age of 42"

                    } else if (inputNumber == 39) {

                        textView.text = "Cleopatra died at 39"

                    }


                    if (inputNumber == 40) {

                        textView.text = "Paul Walker died at 40"

                    } else if (inputNumber == 52) {

                        textView.text =

                            "Wiliam Shakespeare died at 52"
                    }

                }



                if (inputNumber == 56) {

                    textView.text =
                        "Abraham Lincoln died at 56"

                } else if (inputNumber == 78) {

                    textView.text =

                        "Mahatma Gandi died at 78"


                }

            }else {textView.text= "your entry was not valid"


        }


    }
}}