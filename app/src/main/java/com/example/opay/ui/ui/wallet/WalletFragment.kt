package com.example.opay.ui.ui.wallet

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.opay.R
import com.example.opay.ui.adapter.WalletCardAdapter
import kotlinx.android.synthetic.main.fragment_wallet.view.*

class WalletFragment : Fragment() {
    private var walletCardRecyclerView: RecyclerView? = null
    private var walletCardAdapter: WalletCardAdapter? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_wallet, container, false)

        walletCardRecyclerView = view.walletCardRecycler

        //remove shadow of actionbar which is below of actionbar
        (activity as AppCompatActivity?)!!.supportActionBar?.elevation = 0F

        view.cardBgWallet.setBackgroundResource(R.drawable.circuler_bg)

        setUpRecycler()
        return view
    }

    private fun setUpRecycler() {
        walletCardRecyclerView?.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)
        walletCardAdapter = WalletCardAdapter()
        walletCardRecyclerView?.adapter = walletCardAdapter

    }
}