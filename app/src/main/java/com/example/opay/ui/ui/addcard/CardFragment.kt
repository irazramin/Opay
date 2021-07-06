package com.example.opay.ui.ui.addcard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.opay.R
import kotlinx.android.synthetic.main.fragment_card.view.*

class CardFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_card, container, false)

        //remove shadow of actionbar which is below of actionbar
        (activity as AppCompatActivity?)!!.supportActionBar?.elevation = 0F

        //set background to cardView, because their is some issues in xml
        view.cardBgAddCard.setBackgroundResource(R.drawable.circuler_bg)

        view.addNewCardBtn.setOnClickListener {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.action_cardFragment_to_addNewFragment)
        }

        //write your code

        return view
    }

}