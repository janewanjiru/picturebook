package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvphotoone=findViewById<TextView>(R.id.tvphotoone)
        var btnprev=findViewById<Button>(R.id.btnPrev)
        var btnNext=findViewById<Button>(R.id.btnNext1)
        btnprev.setOnClickListener{
            var intent=Intent(baseContext,MainActivity2::class.java)
            startActivity(intent)
        }
//        btnNext.setOnClickListener{
//            var intent=Intent(baseContext,MainActivity::class.java)
//            startActivity(intent)
//        }


    }
}