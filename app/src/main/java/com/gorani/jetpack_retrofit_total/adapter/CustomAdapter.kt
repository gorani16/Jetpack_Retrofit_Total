package com.gorani.jetpack_retrofit_total.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.gorani.jetpack_retrofit_total.R
import com.gorani.jetpack_retrofit_total.model.Plant

class CustomAdapter(private val context: Context, private val dataSet: List<Plant>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.tv_plant_info)
        val imageView: ImageView = view.findViewById(R.id.iv_plant_image)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_plant, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView.text = dataSet[position].name
        Glide.with(context)
            .load(dataSet[position].imageUrl)
            .into(holder.imageView)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }
}