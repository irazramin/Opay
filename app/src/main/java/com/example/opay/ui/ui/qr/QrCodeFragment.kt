package com.example.opay.ui.ui.qr

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.opay.R
import kotlinx.android.synthetic.main.fragment_qr_code.view.*

class QrCodeFragment : Fragment() {
    private lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_qr_code, container, false)


        //navigate to scanQrFragment
        mView.myQrCodeBtn.setOnClickListener {
            findNavController().navigate(R.id.scanQrFragment)
        }


        //write your code

        return mView
    }
}