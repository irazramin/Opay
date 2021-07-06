package com.example.opay.ui.ui.signup.forgetpassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.opay.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_email_forget_pass.view.*

class EmailForgetPassFragment : BottomSheetDialogFragment() {
    private lateinit var rootView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_email_forget_pass, container, false)


        rootView.forgetEmailContinueBtn.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(EmailForgetPassFragmentDirections.actionEmailForgetPassFragmentToForgetPassEmailDigitFragment())
        }

        return rootView
    }

}