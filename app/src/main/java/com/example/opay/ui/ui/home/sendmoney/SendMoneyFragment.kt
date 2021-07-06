package com.example.opay.ui.ui.home.sendmoney

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.opay.R
import com.example.opay.ui.adapter.sendMoneyPagerAdapter
import com.example.opay.ui.ui.home.sendmoney.topup.TopUpSendMoneyFragment
import com.example.opay.ui.ui.home.sendmoney.user.UserSendMoneyFragment
import kotlinx.android.synthetic.main.fragment_send_money.view.*

class SendMoneyFragment : Fragment() {
    private lateinit var mView: View
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_send_money, container, false)

        //store fragment in arrayList for tabLayout
        val fragment = ArrayList<Fragment>()
        fragment.add(UserSendMoneyFragment())
        fragment.add(TopUpSendMoneyFragment())

        //store title in arrayList for tabLayout
        val title = ArrayList<String>()
        title.add("Users")
        title.add("TopUp")

        //this is a adapter class for tabLayout
        val adapter = sendMoneyPagerAdapter(fragment, title, childFragmentManager)

        //set adapter to viewPaper
        mView.sendMoneyViewPager.adapter = adapter

        //set viewPaper to tabLayout , basically viewPaper use for swap fragment 'like whatsapp'
        mView.sendMoneyTab.setupWithViewPager(mView.sendMoneyViewPager)

        return mView
    }

}