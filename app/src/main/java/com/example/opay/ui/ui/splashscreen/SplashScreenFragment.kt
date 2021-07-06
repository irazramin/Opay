package com.example.opay.ui.ui.splashscreen

import android.os.Bundle
import android.os.Handler
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.opay.R

class SplashScreenFragment : Fragment() {
    private lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_splash_screen, container, false)


        //after 2 sec this splash screen gone
        //when app start will see a loading page for certain time
        //basically it is splash screen
        Handler().postDelayed({

            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.onBoardingFragment)

        }, 2000)

        return mView
    }

    override fun onStart() {
        super.onStart()
        (activity as AppCompatActivity).supportActionBar!!.hide()
    }

    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity).supportActionBar!!.hide()
    }


}