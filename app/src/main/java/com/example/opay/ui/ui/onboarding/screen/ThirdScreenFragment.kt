package com.example.opay.ui.ui.onboarding.screen

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.opay.R
import kotlinx.android.synthetic.main.fragment_third_screen.view.*

class ThirdScreenFragment : Fragment() {
    private lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_third_screen, container, false)

        mView.thirdScreenFinish.setOnClickListener {
            findNavController().navigate(R.id.signInFragment)
        }

        //in this page, no need to write code(if you customize anything from your side
        //then write code here)

        return mView
    }
}