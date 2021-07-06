package com.example.opay.ui.ui.home.sendmoney.user

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.opay.R
import com.example.opay.ui.adapter.SendMoneyUserAdapter
import kotlinx.android.synthetic.main.fragment_user_send_money.view.*

class UserSendMoneyFragment : Fragment() {
    private var mAdapter: SendMoneyUserAdapter? = null
    private lateinit var mView: View
    private var img = arrayOf(
        R.drawable.boyy,
        R.drawable.boyy,
        R.drawable.boyy,
        R.drawable.boyy,
        R.drawable.boyy,
        R.drawable.boyy,
        R.drawable.boyy
    )
    private var name = arrayOf(
        "Iraz Ramin",
        "Iraz Ramin",
        "Iraz Ramin",
        "Iraz Ramin",
        "Iraz Ramin",
        "Iraz Ramin",
        "Iraz Ramin"
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_user_send_money, container, false)

        //call the function
        setUpRecycler()

        //write your code

        return mView
    }

    //this function is use setup recyclerView and adapter  for clean coding
    fun setUpRecycler() {
        mView.sendMoneyUserRecyler.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.HORIZONTAL, false)
        mView.sendMoneyUserRecyler.setHasFixedSize(true)
        mAdapter = SendMoneyUserAdapter(img, name)
        mView.sendMoneyUserRecyler.adapter = mAdapter
    }

}