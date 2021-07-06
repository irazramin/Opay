package com.example.opay.ui.ui.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.opay.R
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_profile, container, false)


        view.updateProfileBtn.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.action_profileFragment_to_updateProfileFragment)
        }


        return view
    }
}