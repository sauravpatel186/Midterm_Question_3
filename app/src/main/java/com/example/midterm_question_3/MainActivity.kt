package com.example.midterm_question_3

import android.content.ComponentName
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val activity1 = findViewById<Button>(R.id.activity1)
        val activity2 = findViewById<Button>(R.id.activity2)
        val intent = Intent()
        activity1.setOnClickListener{
            intent.setComponent(
                ComponentName(
                    "com.example.midterm_question_1",
                    "com.example.midterm_question_1.MainActivity"
                )
            )
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, "Hello from app 3");
//
//            intent.putExtra("Value1",6)
//            intent.putExtra("Value1",7)
            intent.setType("text/plain");


            startActivity(intent)
        }
        activity2.setOnClickListener{
            intent.setComponent(
                ComponentName(
                    "com.example.midterm_question_2",
                    "com.example.midterm_question_2.MainActivity"
                )
            )
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, "Hello from app 3");


            intent.setType("text/plain");


            startActivity(intent)

            startActivity(intent)
        }

    }
}