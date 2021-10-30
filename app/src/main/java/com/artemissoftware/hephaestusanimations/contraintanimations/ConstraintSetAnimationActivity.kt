package com.artemissoftware.hephaestusanimations.contraintanimations

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.TransitionManager
import android.view.animation.OvershootInterpolator
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import com.artemissoftware.hephaestusanimations.R

class ConstraintSetAnimationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint_set_animation)

        val rootLayout = findViewById<ConstraintLayout>(R.id.rootLayout);
        val start = findViewById<Button>(R.id.start);

        start.setOnClickListener {

            val set = ConstraintSet()

            set.clone(this@ConstraintSetAnimationActivity, R.layout.second_keyframe);
            set.applyTo(rootLayout);

            val  transition = ChangeBounds();
            transition.setInterpolator(OvershootInterpolator());
            transition.setDuration(2000);
            TransitionManager.beginDelayedTransition(rootLayout, transition);
        }


    }
}