package com.example.opay.ui.ui.addcard.newcard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.Fragment
import com.example.opay.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textfield.TextInputEditText
import kotlinx.android.synthetic.main.fragment_add_new.view.*

open class AddNewFragment : Fragment() {
    private var cardTypeText: TextView? = null
    private var cardPinText: TextView? = null
    private var cardHolderNameText: TextView? = null
    private var cardExpireDateText: TextView? = null
    private var cardPinEditText: TextInputEditText? = null
    private var cardHolderNameEditText: TextInputEditText? = null
    private var cardExpireDateEditText: TextInputEditText? = null
    private var submitToWalletBtn: MaterialButton? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_add_new, container, false)

        cardTypeText = view.addCardTypeName
        cardHolderNameText = view.addCardHolderName
        cardPinText = view.addCardPinNo
        cardExpireDateText = view.addCardExpireDate
        cardHolderNameEditText = view.cardHolderEditText
        cardPinEditText = view.cardDigitEditText
        cardExpireDateEditText = view.expireDateEditText
        submitToWalletBtn = view.submitAddCard

        getAndSetCardInfo()
        return view
    }

    fun getAndSetCardInfo() {

        cardPinEditText?.addTextChangedListener { text ->
            cardPinText?.text = text.toString()
        }

        cardHolderNameEditText?.addTextChangedListener { text ->
            cardHolderNameText?.text = text.toString().trim()
        }

        cardExpireDateEditText?.addTextChangedListener { text ->
            cardExpireDateText?.text = text.toString()
        }

    }

}