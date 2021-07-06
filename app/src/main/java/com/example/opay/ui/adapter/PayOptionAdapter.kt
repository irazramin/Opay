package com.example.opay.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.opay.R

class PayOptionAdapter(
    private val payTitle: Array<String>?,
    private val payImage: Array<Int>,
    private val onItemClickListener: OnItemClickListener
) :
    RecyclerView.Adapter<PayOptionAdapter.PayOptionAdapterVH>() {


    interface OnItemClickListener {
        fun setOnItemClickListener(position: Int)
    }


    class PayOptionAdapterVH(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var payOptionTitle: TextView = itemView.findViewById(R.id.payOptionTextView)
        val payOptionImage: ImageView = itemView.findViewById(R.id.payOptionImageView)
        val btn: ConstraintLayout = itemView.findViewById(R.id.payOptionBtn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PayOptionAdapterVH {
        val layoutInflater =
            LayoutInflater.from(parent.context).inflate(R.layout.pay_option_item_row, parent, false)

        return PayOptionAdapterVH(layoutInflater)
    }

    override fun onBindViewHolder(holder: PayOptionAdapterVH, position: Int) {
        //holder.itemView.payOp = payTitle[position].toString()
        holder.payOptionTitle.text = payTitle!![position]
        holder.payOptionImage.setImageResource(payImage[position])

        holder.btn.setOnClickListener {
            onItemClickListener.setOnItemClickListener(position)
        }
    }

    override fun getItemCount(): Int {
        return payImage.size
    }
}