package com.example.koltinlogindesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val view =  inflater.inflate(R.layout.fragment_home, container, false);
        val recyclerview :RecyclerView = view.findViewById(R.id.recyclerView)

        val musicList :ArrayList<ItemsViewModel>  = ArrayList()
        val musicAdapter = MusicAdapter(musicList)
        recyclerview.adapter= musicAdapter

        musicList.add(ItemsViewModel(R.drawable.img,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.img,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.img,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.img,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.img,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.img,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.img,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.img,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.img,"music title","same title and decsripation"))



        recyclerview.layoutManager = LinearLayoutManager(activity)
        return view
    }

}