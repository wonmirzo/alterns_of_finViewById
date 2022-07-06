package com.wonmirzo.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_kotlin_synthetics.*

class KotlinSyntheticsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin_synthetics)
        initViews()
    }

    private fun initViews() {
        btnSynthetics.setOnClickListener {
            tvSynthetics.text = "Kotlin Synthetics"
        }
    }
}