package com.himanshu.gallery

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ImageAdapter(): RecyclerView.Adapter<NewsViewHolder>()
{    private val items: ArrayList<Images> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder
    {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.iteems_view,parent,false)
        val viewHolder =  NewsViewHolder(view)

        return viewHolder
    }
    override fun getItemCount(): Int
    {
        return items.size
    }
    override fun onBindViewHolder(holder: NewsViewHolder, position: Int)
    {

        val currentItem = items[position]

        Glide.with(holder.imageView.context).load(currentItem.imageUrl).into(holder.imageView)
    }
    fun updateImages(updatedNews: ArrayList<Images>)
    {
        items.clear()
        items.addAll(updatedNews)
        notifyDataSetChanged()
    }
}
class  NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val imageView: ImageView = itemView.findViewById(R.id.image)
}
