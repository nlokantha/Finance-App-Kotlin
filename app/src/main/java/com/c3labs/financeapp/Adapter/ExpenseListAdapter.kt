package com.c3labs.financeapp.Adapter

import android.content.Context
import android.icu.text.DecimalFormat
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.c3labs.financeapp.Domain.ExpenseDomain
import com.c3labs.financeapp.databinding.ViewholderItemsBinding

class ExpenseListAdapter(private val items:MutableList<ExpenseDomain>): RecyclerView.Adapter<ExpenseListAdapter.Viewholder>() {
    class Viewholder (val binding: ViewholderItemsBinding):RecyclerView.ViewHolder(binding.root)

    private lateinit var context:Context
    var formatter :DecimalFormat? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExpenseListAdapter.Viewholder {
        context = parent.context
        formatter = DecimalFormat("###,###,###,##")
        val binding=ViewholderItemsBinding.inflate(LayoutInflater.from(context),parent,false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: ExpenseListAdapter.Viewholder, position: Int) {
        val item = items[position]
        holder.binding.textViewTitle.text = item.title
        holder.binding.textViewTime.text = item.time
        holder.binding.textViewPrice.text = "$"+formatter?.format(item.price)
        val drawableResourceId = holder.itemView.resources.getIdentifier(item.pic,"drawable",context.packageName)

        Glide.with(context)
            .load(drawableResourceId)
            .into(holder.binding.imageViewPic)

    }

    override fun getItemCount(): Int = items.size
}