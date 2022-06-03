package com.android.animation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setClick(R.id.SceneTransitionBasic, com.example.android.activityscenetransitionbasic.MainActivity::class.java)
        setClick(R.id.BasicTransition, com.example.android.basictransition.MainActivity::class.java)
        setClick(R.id.CustomTransition, com.example.android.customtransition.MainActivity::class.java)
        setClick(R.id.DrawableAnimations, com.example.android.drawableanimations.MainActivity::class.java)
        setClick(R.id.GridToPager, com.google.samples.gridtopager.MainActivity::class.java)
        setClick(R.id.Interpolator, com.example.android.interpolator.MainActivity::class.java)
        setClick(R.id.Motion, com.example.android.motion.MainActivity::class.java)
//        setClick(R.id.OurStreets, com.google.samples.apps.ourstreets.activity.MainActivity::class.java)
        setClick(R.id.RevealEffectBasic, com.example.android.revealeffectbasic.MainActivity::class.java)
        setClick(R.id.Unsplash, com.example.android.unsplash.MainActivity::class.java)
    }

    private fun setClick(id: Int, clazz: Class<*>) {
        findViewById<View>(id).setOnClickListener {
            startActivity(
                Intent(this, clazz)
            )
        }
    }
}