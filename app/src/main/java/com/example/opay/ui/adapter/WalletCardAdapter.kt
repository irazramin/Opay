package com.example.opay.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.opay.R

class WalletCardAdapter : RecyclerView.Adapter<WalletCardAdapter.WalletCardAdapterVH>() {
    val cardBodyColor = arrayOf("#673AB7", "#575654")
    val cardLogo = arrayOf(R.drawable.mastercard, R.drawable.ic_visa)
    val cardBankName = arrayOf("MASTERCARD", "VISA")

    class WalletCardAdapterVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var cardBody: ConstraintLayout = itemView.findViewById(R.id.credit_card_body)
        val cardName: TextView = itemView.findViewById(R.id.card_bank)
        val cardBankLogo: ImageView = itemView.findViewById(R.id.card_bank_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WalletCardAdapterVH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.credit_card_item_row, parent, false)

        return WalletCardAdapterVH(view)
    }

    override fun onBindViewHolder(holder: WalletCardAdapterVH, position: Int) {
        holder.cardBody.setBackgroundColor(Color.parseColor(cardBodyColor[position]))
        holder.cardBankLogo.setImageResource(cardLogo[position])
        holder.cardName.text = cardBankName[position]
    }

    override fun getItemCount(): Int {
        return 2
    }
}