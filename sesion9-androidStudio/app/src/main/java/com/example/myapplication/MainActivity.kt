package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToSecondActivity(view: View) {
        val intent = Intent(this, LinearLayout::class.java)
        startActivity(intent)
    }

    fun relative(view: View) {
        val intent = Intent(this, Relative::class.java)
        startActivity(intent)
    }
    fun contraint(view: View) {
        val intent = Intent(this, ConstraintLayout::class.java)
        startActivity(intent)
    }
    fun table(view: View) {
        val intent = Intent(this, Tablelayout::class.java)
        startActivity(intent)
    }


}
