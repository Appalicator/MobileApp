package com.example.zenflow

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.RadioButton
import android.widget.TextView

class welcome_screen_test1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen_test1)

        var alpha_in = AnimationUtils.loadAnimation(this, R.anim.alpha_in)

        var radioButt1:RadioButton = findViewById<RadioButton>(R.id.radio_butt1)
        var radioButt2:RadioButton = findViewById<RadioButton>(R.id.radio_butt2)
        var radioButt3:RadioButton = findViewById<RadioButton>(R.id.radio_butt3)

        var textView7:TextView= findViewById<TextView>(R.id.textView7)

        textView7.startAnimation(alpha_in)
        radioButt1.startAnimation(alpha_in)
        radioButt2.startAnimation(alpha_in)
        radioButt3.startAnimation(alpha_in)

        radioButt1.setOnClickListener {
            val intent = Intent(this, welcome_screen_test2::class.java)
            startActivity(intent)
        }
        radioButt2.setOnClickListener {
            val intent = Intent(this, welcome_screen_test2::class.java)
            startActivity(intent)
        }
        radioButt3.setOnClickListener {
            val intent = Intent(this, welcome_screen_test2::class.java)
            startActivity(intent)
        }
    }
}