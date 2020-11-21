package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_rview.view.*

class CustomeAdapter(var userArray:ArrayList<data>):
    RecyclerView.Adapter<CustomeAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v= LayoutInflater.from(parent.context).inflate(R.layout.recycler_rview,parent,false)
        return ViewHolder(v)
     }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data:data=userArray[position]
        holder.text_name.text=data.name
        holder.image.setImageResource(data.image)
        holder.textAge.text=data.age.toString()
    }

    override fun getItemCount(): Int {
      return  userArray.size
    }



    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val image=itemView.imageView as ImageView
        val text_name=itemView.textOne as TextView
        val textAge=itemView.textTwo as TextView
    }
}