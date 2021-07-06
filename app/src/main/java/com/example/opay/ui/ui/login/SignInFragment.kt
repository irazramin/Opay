package com.example.opay.ui.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.opay.R
import kotlinx.android.synthetic.main.fragment_sign_in.view.*


class SignInFragment : Fragment() {

    private lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_sign_in, container, false)

        //remove back arrow button
        (activity as AppCompatActivity?)!!.supportActionBar!!.setDisplayHomeAsUpEnabled(false)

        //remove shadow of actionbar which is below of actionbar
        (activity as AppCompatActivity?)!!.supportActionBar?.elevation = 0F

        //navigate signIn to signUp page
        mView.createAccBtn.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.action_signInFragment_to_signUpFragment)
        }

        //complete signIn and navigate main page
        mView.signInBtn.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.action_signInFragment_to_homeFragment)
        }

        //navigate forget password page
        //if user forget their password ,they can update their password
        mView.forgetPasswordBtn.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.action_signInFragment_to_emailForgetPassFragment)
        }

        return mView
    }

}