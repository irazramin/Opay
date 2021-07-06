package com.example.opay.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.opay.R

class SendMoneyUserAdapter(private val img: Array<Int>, private val name: Array<String>) :
    RecyclerView.Adapter<SendMoneyUserAdapter.SendMoneyUserAdapterVH>() {
    class SendMoneyUserAdapterVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.sendMoneyReUserNameText)
        val img = itemView.findViewById<ImageView>(R.id.sendMoneyReUserImg)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SendMoneyUserAdapterVH {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.send_money_recent_user_item_row, parent, false)
        return SendMoneyUserAdapterVH(layoutInflater)
    }

    override fun onBindViewHolder(holder: SendMoneyUserAdapterVH, position: Int) {
        holder.img.setImageResource(img[position])
        holder.name.text = name[position]

    }

    override fun getItemCount(): Int {
        return name.size
    }
}