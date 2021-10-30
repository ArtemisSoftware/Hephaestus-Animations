package com.artemissoftware.hephaestusanimations.contraintanimations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.Transition
import android.transition.TransitionManager
import android.view.View
import android.widget.ImageView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.Placeholder
import com.artemissoftware.hephaestusanimations.R
import android.view.animation.BounceInterpolator




class PlaceholderAnimationActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var placeholder: Placeholder
    lateinit var rootLayout: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_placeholder_animation)

        placeholder = findViewById<Placeholder>(R.id.placeholder);
        rootLayout = findViewById<ConstraintLayout>(R.id.rootLayout);
        val img1 = findViewById<ImageView>(R.id.img1);
        val img2 = findViewById<ImageView>(R.id.img2);
        val img3 = findViewById<ImageView>(R.id.img3);

        img1.setOnClickListener(this);
        img2.setOnClickListener(this);
        img3.setOnClickListener(this);

    }

    override fun onClick(view: View?) {
        val transition: Transition = ChangeBounds()
        transition.setInterpolator(BounceInterpolator())
        transition.setDuration(2000)
        TransitionManager.beginDelayedTransition(rootLayout, transition)
        placeholder.setContentId(view!!.id)
    }
}