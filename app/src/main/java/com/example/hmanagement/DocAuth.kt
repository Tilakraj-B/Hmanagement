package com.example.hmanagement

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import androidx.fragment.app.FragmentContainer
import com.example.hmanagement.databinding.ActivityDocAuthBinding
import com.example.hmanagement.databinding.StartBinding

class DocAuth : AppCompatActivity() {
    private lateinit var binding: ActivityDocAuthBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDocAuthBinding.inflate(layoutInflater)
        setContentView(binding.root)




    }
}