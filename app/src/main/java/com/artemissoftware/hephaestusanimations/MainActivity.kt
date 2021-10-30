package com.artemissoftware.hephaestusanimations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.artemissoftware.hephaestusanimations.contraintanimations.GroupAnimationActivity
import com.artemissoftware.hephaestusanimations.contraintanimations.MainConstraintAnimationsActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        (findViewById<Button>(R.id.btn_constraint_layout_animations) as Button).setOnClickListener {


            val intent = Intent(this, MainConstraintAnimationsActivity::class.java)
            startActivity(intent)
        }


    }
}