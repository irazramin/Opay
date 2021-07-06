package com.example.opay.ui.ui.home.withdraw

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.opay.R


class WithdrawFragment : Fragment() {
    private lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_withdraw, container, false)

        //remove shadow of actionbar which is below of actionbar
        (activity as AppCompatActivity?)!!.supportActionBar?.elevation = 0F

        //write your code

        return mView
    }
}