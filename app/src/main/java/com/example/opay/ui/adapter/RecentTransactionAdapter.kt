package com.example.opay.ui.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.opay.R

class RecentTransactionAdapter(
    private val money: Array<String>,
    private val paymentStatus: Array<String>,
    private val paymentStatusColor: Array<String>
) : RecyclerView.Adapter<RecentTransactionAdapter.RecentTransactionAdapterVH>() {
    class RecentTransactionAdapterVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val money: TextView = itemView.findViewById(R.id.moneyText)
        val paymentStatusText: TextView = itemView.findViewById(R.id.paymentStatusText)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecentTransactionAdapterVH {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.recent_tansaction_item_row, parent, false)

        return RecentTransactionAdapterVH(view)
    }

    override fun onBindViewHolder(holder: RecentTransactionAdapterVH, position: Int) {

        holder.paymentStatusText.text = paymentStatus[position]
        holder.money.text = money[position]
        holder.money.setTextColor(Color.parseColor(paymentStatusColor[position]))
        holder.paymentStatusText.setTextColor(Color.parseColor(paymentStatusColor[position]))
    }

    override fun getItemCount(): Int {
        return paymentStatus.size
    }
}