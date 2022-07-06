package com.wonmirzo.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.wonmirzo.viewbinding.databinding.ActivityViewBindingBinding

class ViewBindingActivity : AppCompatActivity() {
    private lateinit var binding: ActivityViewBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityViewBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initViews()
    }

    private fun initViews() {
        binding.btnViewBinding.setOnClickListener {
            binding.tvViewBinding.text = "View Binding"
        }
    }
}