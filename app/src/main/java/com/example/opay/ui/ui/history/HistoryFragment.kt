package com.example.opay.ui.ui.history

import android.app.DatePickerDialog
import android.os.Build
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.opay.R
import com.example.opay.ui.adapter.RecentTransactionAdapter
import kotlinx.android.synthetic.main.fragment_history.view.*

class HistoryFragment : Fragment() {
    private var payOptionTitle: Array<String>? = null
    private var recentTransactionAdapter: RecentTransactionAdapter? = null
    private var transactionHistoryRecycler: RecyclerView? = null
    private val money = arrayOf(
        "+ $20000.00",
        "- $100.00",
        "+ $50.00",
        "+ $30.00",
        "- $150.00",
        "+ $20000.00",
        "- $100.00",
        "+ $50.00",
        "+ $30.00",
        "- $150.00"
    )
    private val paymentStatus = arrayOf(
        "Received",
        "Sent",
        "Received",
        "Pending",
        "Sent",
        "Received",
        "Sent",
        "Received",
        "Pending",
        "Sent"
    )
    private val paymentStatusColor =
        arrayOf(
            "#008000",
            "#0000FF",
            "#008000",
            "#FFA500",
            "#0000FF",
            "#008000",
            "#0000FF",
            "#008000",
            "#FFA500",
            "#0000FF"
        )

    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_history, container, false)
        transactionHistoryRecycler = view.transactionHistoryRecycler

        //get text from resource folder(string)
        payOptionTitle = resources.getStringArray(R.array.payTitle)

        //remove shadow of actionbar which is below of actionbar
        (activity as AppCompatActivity?)!!.supportActionBar?.elevation = 0F

        //set datePicker by click button
        view.datePickerBtn.setOnClickListener {
            val datePicker = DatePickerDialog(requireContext())

            datePicker.show()
        }
        //call method
        setUpRecycler()


        //write your code

        return view
    }

    private fun setUpRecycler() {
        //set layout type for recyclerview
        transactionHistoryRecycler?.layoutManager = LinearLayoutManager(requireContext())

        //set fixed size of recycler view
        transactionHistoryRecycler?.setHasFixedSize(true)

        //pass data to adapter class

        recentTransactionAdapter =
            RecentTransactionAdapter(money, paymentStatus, paymentStatusColor)

        //set adapter to recyclerview
        transactionHistoryRecycler?.adapter = recentTransactionAdapter
    }
}