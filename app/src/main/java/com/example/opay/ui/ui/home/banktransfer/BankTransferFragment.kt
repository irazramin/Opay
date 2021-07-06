package com.example.opay.ui.ui.home.banktransfer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.Fragment
import com.example.opay.R
import kotlinx.android.synthetic.main.fragment_bank_transfer.view.*

class BankTransferFragment : Fragment() {
    private lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_bank_transfer, container, false)

        //you need add your bank name
        val bankName = arrayListOf("Choose", "Bank1", "Bank2", "Bank3", "Bank4", "Bank5")

        //this is a adapter , it is attached your bank name to your drop-down menu
        val adapter: ArrayAdapter<String> =
            ArrayAdapter(requireContext(), android.R.layout.simple_spinner_item, bankName)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        //drop-down item add to adapter
        mView.bankTransferBanksName.adapter = adapter
        return mView
    }

}