package com.example.hmanagement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.hmanagement.databinding.StartBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : StartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = StartBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.Doctor.setOnClickListener {
           startActivity(Intent(this,DocAuth::class.java));
       }
        binding.Nurse.setOnClickListener {
            startActivity(Intent(this,NurAuth::class.java))
        }
    }
}