package com.example.opay.ui.ui.signup.forgetpassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.opay.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_forget_pass_email_digit.view.*


class ForgetPassEmailDigitFragment : BottomSheetDialogFragment() {
    private lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_forget_pass_email_digit, container, false)

        //navigate to forgetPassword which is for , when user add mail in previous fragment they got a confirmation code which
        // is add your developer
        mView.receivedDigitContinueBtn.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.action_forgetPassEmailDigitFragment_to_resetPassFragment)

        }

        //write your code
        return mView
    }

}