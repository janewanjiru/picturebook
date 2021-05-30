package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btnPrev1=findViewById<Button>(R.id.btnprev1)
        var btnNext1=findViewById<Button>(R.id.btnNext1)
        btnPrev1.setOnClickListener{
            var intent=Intent(baseContext,MainActivity3::class.java)
            startActivity(intent)
        }
       btnPrev1.setOnClickListener{
            var intent=Intent(baseContext,MainActivity::class.java)
            startActivity(intent)
        }



    }
}