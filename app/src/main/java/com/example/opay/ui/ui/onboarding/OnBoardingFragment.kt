package com.example.opay.ui.ui.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.opay.R
import com.example.opay.ui.adapter.OnBoardingAdapter
import com.example.opay.ui.ui.onboarding.screen.FirstScreenFragment
import com.example.opay.ui.ui.onboarding.screen.SecondScreenFragment
import com.example.opay.ui.ui.onboarding.screen.ThirdScreenFragment
import kotlinx.android.synthetic.main.fragment_on_boarding.view.*


class OnBoardingFragment : Fragment() {
    private lateinit var mView: View
    private lateinit var mAdapter: OnBoardingAdapter
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mView = inflater.inflate(R.layout.fragment_on_boarding, container, false)

        //requireActivity().window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        //requireActivity().actionBar?.hide()

        (activity as AppCompatActivity).supportActionBar!!.hide()

        //get viewPager reference from xml file
        val pager = mView.onBoardingViewPager

        val fragment = arrayListOf(
            FirstScreenFragment(),
            SecondScreenFragment(),
            ThirdScreenFragment()
        )

        //initialize adapter class
        mAdapter = OnBoardingAdapter(fragment, requireActivity().supportFragmentManager, lifecycle)

        pager.adapter = mAdapter
        // mView.onBoardingTab.setupWithViewPager(pager,true)


        return mView
    }

    override fun onStart() {
        super.onStart()
        (activity as AppCompatActivity).supportActionBar!!.hide()
    }

    override fun onStop() {
        super.onStop()
        (activity as AppCompatActivity).supportActionBar!!.show()
    }


    override fun onResume() {
        super.onResume()
        (activity as AppCompatActivity).supportActionBar!!.hide()
    }


}