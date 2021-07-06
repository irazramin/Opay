package com.example.opay.ui.ui.signup.forgetpassword

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.opay.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import kotlinx.android.synthetic.main.fragment_reset_pass.view.*

class ResetPassFragment : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_reset_pass, container, false)

        view.resetPassBtn.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.signInFragment)

        }

        return view
    }
}