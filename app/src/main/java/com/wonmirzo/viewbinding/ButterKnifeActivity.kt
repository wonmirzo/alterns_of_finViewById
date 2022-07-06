package com.wonmirzo.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import butterknife.BindView
import butterknife.ButterKnife

class ButterKnifeActivity : AppCompatActivity() {
    @BindView(R.id.btnButter)
    lateinit var btnButter: Button

    @BindView(R.id.tvButter)
    lateinit var tvButter: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_butter_knife)
        ButterKnife.bind(this)
        initViews()
    }

    private fun initViews() {
        btnButter.setOnClickListener {
            tvButter.text = "Butter Knife"
        }
    }
}