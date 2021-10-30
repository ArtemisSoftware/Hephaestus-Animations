package com.artemissoftware.hephaestusanimations.contraintanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Fade
import android.transition.Transition
import android.transition.TransitionManager
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Group
import com.artemissoftware.hephaestusanimations.R


class GroupAnimationActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group_animation)

        val group = findViewById(R.id.group) as Group
        val start = findViewById(R.id.start) as Button
        val rootLayout = findViewById(R.id.rootLayout) as ConstraintLayout

        start.setOnClickListener {
            val fade: Transition = Fade()
            fade.setDuration(1500)
            TransitionManager.beginDelayedTransition(rootLayout, fade)
            start.setVisibility(View.GONE)
            group.setVisibility(View.VISIBLE)

        }


    }
}