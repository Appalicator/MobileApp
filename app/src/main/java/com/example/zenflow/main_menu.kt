package com.example.zenflow


import android.app.Notification
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.app.NotificationCompat
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.channels.Channel
import org.json.JSONObject
import java.net.URL

class main_menu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)

        val key:String = "beff1410e1ce24a8d3f42b0378031768"
        val city:String = "Barnaul"
        val url:String = "https://api.openweathermap.org/data/2.5/weather?q=$city&appid=$key"


        val btn_tomedi: Button = findViewById(R.id.Main_menu_tomeditation)
        val btn_spr: Button = findViewById(R.id.Main_menu_tosprav)
        val btn_ach: Button = findViewById(R.id.Main_menu_toach)
        val btn_melodi: Button = findViewById(R.id.Main_menu_tomelodi)
        val btn_lit: Button = findViewById(R.id.Main_menu_toliter)
        val btn_set : ImageView = findViewById(R.id.btn_setting)

        val weatherInfo: TextView = findViewById(R.id.textWeather)

        try {
            GlobalScope.async(Dispatchers.Default) {
                val ApiResponse = URL(url).readText()

                val weather = JSONObject(ApiResponse).getJSONObject("main")
                val desc = weather.getString("temp")


            }

        } catch(ex: Exception){
            Toast.makeText(this, "$ex", Toast.LENGTH_SHORT).show()
        }

        btn_tomedi.setOnClickListener {
            val intent = Intent(this, meditation_main_menu::class.java)
            startActivity(intent)
        }
        btn_spr.setOnClickListener{
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_ach.setOnClickListener{
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_melodi.setOnClickListener{
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_set.setOnClickListener{
            val intent = Intent(this, setting_main_window::class.java)
            startActivity(intent)
        }
        btn_lit.setOnClickListener{
            val intent = Intent(this, book_main::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        //var builder = NotificationCompat.Builder(this, "CHANNEL_ID")
        //    .setContentText("qwe")
         //   .setContentText("qwe")
         //   .setPriority(NotificationCompat.PRIORITY_DEFAULT)
    }

}