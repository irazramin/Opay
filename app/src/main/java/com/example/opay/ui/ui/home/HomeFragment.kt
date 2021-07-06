package com.example.opay.ui.ui.home

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.opay.R
import com.example.opay.ui.adapter.PayOptionAdapter
import com.example.opay.ui.adapter.RecentTransactionAdapter
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment(), PayOptionAdapter.OnItemClickListener {
    private val payImage = arrayOf(
        R.drawable.ic_card, R.drawable.ic_withdraw, R.drawable.ic_bank, R.drawable.ic_send_money,
        R.drawable.ic_qr_code, R.drawable.ic_more
    )

    private val money = arrayOf("+ $20000.00", "- $100.00", "+ $50.00", "+ $30.00", "- $150.00")
    private val paymentStatus = arrayOf("Received", "Sent", "Received", "Pending", "Sent")

    private val paymentStatusColor =
        arrayOf("#008000", "#0000FF", "#008000", "#FFA500", "#0000FF")

    private var payOptionRecyclerView: RecyclerView? = null
    private var mAdapter: PayOptionAdapter? = null
    private var payOptionTitle: Array<String>? = null
    private var recentTransactionAdapter: RecentTransactionAdapter? = null
    private var recentTransactionRecyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        //attribute's id
        payOptionRecyclerView = view.findViewById(R.id.payOptionRecycler)
        recentTransactionRecyclerView = view.findViewById(R.id.recentTransactionRecycler)

        //remove shadow of actionbar which is below of actionbar
        (activity as AppCompatActivity?)!!.supportActionBar?.elevation = 0F

        //get text from resource folder(string)
        payOptionTitle = resources.getStringArray(R.array.payTitle)

        //call function
        setUpRecycler()


        view.cardBg.setBackgroundResource(R.drawable.circuler_bg)
        return view
    }

    private fun setUpRecycler() {
        //set layout type for recyclerview
        recentTransactionRecyclerView?.layoutManager = LinearLayoutManager(requireContext())
        payOptionRecyclerView?.layoutManager = GridLayoutManager(requireContext(), 3)

        //set fixed size of recycler view
        payOptionRecyclerView?.setHasFixedSize(true)
        recentTransactionRecyclerView?.setHasFixedSize(true)

        //pass data to adapter class
        mAdapter = PayOptionAdapter(payOptionTitle, payImage, this)
        recentTransactionAdapter =
            RecentTransactionAdapter(money, paymentStatus, paymentStatusColor)

        //set adapter to recyclerview
        payOptionRecyclerView?.adapter = mAdapter
        recentTransactionRecyclerView?.adapter = recentTransactionAdapter
    }

    override fun setOnItemClickListener(position: Int) {
        if (position == 0) {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.cardFragment)
        }
        if (position == 1) {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.withdrawFragment)
        }
        if (position == 2) {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.bankTransferFragment)
        }
        if (position == 3) {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.sendMoneyFragment)
        }
        if (position == 4) {
            Navigation.findNavController(requireActivity(), R.id.navHostFragmentId)
                .navigate(R.id.qrCodeFragment)
        }

        if (position == 5) {
            val dialogBuilder = MaterialAlertDialogBuilder(requireContext())

            dialogBuilder.setMessage("If you want more option")
            dialogBuilder.setPositiveButton("Ok", DialogInterface.OnClickListener { dialog, which ->
                dialog.dismiss()
            })

            dialogBuilder.setNegativeButton(
                "Cancel",
                DialogInterface.OnClickListener { dialog, which ->
                    dialog.cancel()
                })
        }
    }

}