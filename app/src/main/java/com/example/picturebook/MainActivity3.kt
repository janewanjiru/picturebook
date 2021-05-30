package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btnPrev3=findViewById<Button>(R.id.btnPrev3)
        var btnNext3=findViewById<Button>(R.id.btnNext3)
        btnPrev3.setOnClickListener{
            var intent=Intent(baseContext,MainActivity4::class.java)
            startActivity(intent)
        }
        btnNext3.setOnClickListener{
            var intent=Intent(baseContext,MainActivity::class.java)

        }

    }
}