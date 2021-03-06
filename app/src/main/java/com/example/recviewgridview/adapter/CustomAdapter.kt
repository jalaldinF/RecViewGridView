package com.example.recviewgridview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recviewgridview.R
import com.example.recviewgridview.moduls.Member
import java.util.zip.Inflater

class CustomAdapter(val member: List<Member>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.custom_layout,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val member = member[position]

        if (holder is CustomViewHolder){
            holder.fist_name.text = member.lastName
            holder.last_name.text = member.name
        }
    }

    override fun getItemCount(): Int {
        return member.size
    }
    class CustomViewHolder(view: View):RecyclerView.ViewHolder(view){
        val fist_name = view.findViewById<TextView>(R.id.first_name)
        val last_name = view.findViewById<TextView>(R.id.last_name)
    }
}