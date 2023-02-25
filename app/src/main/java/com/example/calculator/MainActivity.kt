package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val n1: EditText = findViewById(R.id.et1)
        val n2: EditText = findViewById(R.id.et2)
        val tot: EditText = findViewById(R.id.res)
        val b1: Button = findViewById(R.id.bt1)
        val b2: Button = findViewById(R.id.bt2)
        val b3: Button = findViewById(R.id.bt3)
        val b4: Button = findViewById(R.id.bt4)


        b1.setOnClickListener {
            val vl1 = n1.text.toString().toInt()
            val vl2 = n2.text.toString().toInt()

            val result = vl1 + vl2
            tot.setText(result.toString())
        }
        b2.setOnClickListener {
            val vl1 = n1.text.toString().toInt()
            val vl2 = n2.text.toString().toInt()

            val result = vl1 - vl2
            tot.setText(result.toString())
        }
        b3.setOnClickListener {
            val vl1 = n1.text.toString().toInt()
            val vl2 = n2.text.toString().toInt()

            val result = vl1 * vl2
            tot.setText(result.toString())
        }
        b4.setOnClickListener {
            val vl1 = n1.text.toString().toInt()
            val vl2 = n2.text.toString().toInt()

            val result = vl1 / vl2
            tot.setText(result.toString())
        }
    }
}

