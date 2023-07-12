package com.example.koltinlogindesign

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MusicAdapter (private val mlist : List<ItemsViewModel>) : RecyclerView.Adapter<MusicAdapter.viewholder>() {

    class viewholder (ItemView : View) : RecyclerView.ViewHolder(ItemView)
    {
        val imageview : ImageView = itemView.findViewById(R.id.songimage)
        val menuimage : ImageView = itemView.findViewById(R.id.menuimage)
        val title : TextView= itemView.findViewById(R.id.title)
        val descripation  : TextView= itemView.findViewById(R.id.descripation)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.music_card,parent,false)
        return viewholder(view)
    }

    override fun getItemCount(): Int {
       return mlist.size

    }

    override fun onBindViewHolder(holder: viewholder, position: Int) {
        val itemlist = mlist[position];
        holder.imageview.setImageResource(itemlist.musicimage)
        holder.title.setText(itemlist.title)
        holder.title.setText(itemlist.descripation)
    }
}

data class ItemsViewModel(val musicimage: Int, val title: String,val descripation : String ) {
}


