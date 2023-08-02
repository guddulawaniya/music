package com.example.koltinlogindesign

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.core.app.ActivityOptionsCompat
import androidx.core.app.SharedElementCallback
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class HomeFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        config()

        val view =  inflater.inflate(R.layout.fragment_home, container, false);
        val recyclerview :RecyclerView = view.findViewById(R.id.recyclerView)

        val musicList :ArrayList<ItemsViewModel>  = ArrayList()
        val musicAdapter = MusicAdapter(musicList)
        recyclerview.adapter= musicAdapter
//        val playsongs: CardView = view.findViewById(R.id.playsongcard)

        musicList.add(ItemsViewModel(R.drawable.music_image,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.music_image,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.music_image,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.music_image,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.music_image,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.music_image,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.music_image,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.music_image,"music title","same title and decsripation"))
        musicList.add(ItemsViewModel(R.drawable.music_image,"music title","same title and decsripation"))

//        playsongs.setOnClickListener(){
//            val intent = Intent(context, playing_Activity::class.java)
//            val bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(
//                requireActivity(),
//                playsongs,
//                "playcard"
//            ).toBundle()
//            startActivity(intent, bundle)
//
//        }




        recyclerview.layoutManager = LinearLayoutManager(activity)
        return view
    }

    private fun config() {
        setExitSharedElementCallback(object : SharedElementCallback() {})
        requireActivity().window.sharedElementsUseOverlay = false
    }

}