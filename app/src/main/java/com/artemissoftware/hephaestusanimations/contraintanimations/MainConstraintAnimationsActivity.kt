package com.artemissoftware.hephaestusanimations.contraintanimations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.artemissoftware.hephaestusanimations.R

class MainConstraintAnimationsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_constraint_animations)

        (findViewById<Button>(R.id.btn_group_animation) as Button).setOnClickListener {


            val intent = Intent(this, GroupAnimationActivity::class.java)
            startActivity(intent)
        }

        (findViewById<Button>(R.id.btn_constraint_set_animation) as Button).setOnClickListener {


            val intent = Intent(this, ConstraintSetAnimationActivity::class.java)
            startActivity(intent)
        }
    }
}