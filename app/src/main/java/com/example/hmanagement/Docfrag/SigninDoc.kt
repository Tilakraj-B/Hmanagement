package com.example.hmanagement.Docfrag

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ClickableSpan
import android.text.style.ForegroundColorSpan
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.FragmentTransaction
import com.example.hmanagement.R
import com.example.hmanagement.databinding.FragmentSigninDocBinding

class SigninDoc : Fragment() {

    private lateinit var viewModel: SigninDocViewModel
    private lateinit var binding :FragmentSigninDocBinding
    private lateinit var ss : SpannableString
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FragmentSigninDocBinding.inflate(layoutInflater)
        val text: String =  "New User? Sign UP"
        ss = SpannableString(text)
        ss.setSpan(ForegroundColorSpan(ContextCompat.getColor(requireContext(),R.color.purple_200)),11,17, Spanned.SPAN_INCLUSIVE_INCLUSIVE)
        val clickableSpan:ClickableSpan = object : ClickableSpan(){
            override fun onClick(p0: View) {
                opensignup()
            }

        }




        return binding.root
    }

    fun opensignup(){

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(SigninDocViewModel::class.java)
    }

}

