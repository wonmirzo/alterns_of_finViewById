package com.wonmirzo.viewbinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val btnButterKnife: Button = findViewById(R.id.btnButterKnife)
        val btnKotlinSynthetics: Button = findViewById(R.id.btnKotlinSynthetics)
        val btnViewBinding: Button = findViewById(R.id.btnViewBinding)

        btnButterKnife.setOnClickListener {
            callButterKnifeActivity()
        }
        btnKotlinSynthetics.setOnClickListener {
            callKotlinSyntheticsActivity()
        }
        btnViewBinding.setOnClickListener {
            callViewBindingActivity()
        }
    }

    private fun callViewBindingActivity() {
        Intent(this, ViewBindingActivity::class.java).also {
            startActivity(it)
        }
    }

    private fun callKotlinSyntheticsActivity() {
        Intent(this, KotlinSyntheticsActivity::class.java).also {
            startActivity(it)
        }
    }

    private fun callButterKnifeActivity() {
        Intent(this, ButterKnifeActivity::class.java).also {
            startActivity(it)
        }
    }
}