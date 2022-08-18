package com.voslowall.valleyoslowallpapers.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.voslowall.valleyoslowallpapers.MainActivity
import com.voslowall.valleyoslowallpapers.R
import com.voslowall.valleyoslowallpapers.model.WallPaperData


class WallPaperAdapter(
    private var c:Context,
    private var wallImgLis:ArrayList<WallPaperData>
    ) :RecyclerView.Adapter<WallPaperAdapter.WallPaperViewHolder>() {
        inner class WallPaperViewHolder(v : View):RecyclerView.ViewHolder(v){
            val wallPaperImg = v.findViewById<ImageView>(R.id.wall_img)!!
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WallPaperViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.wall_paper_item,parent,false)
        return WallPaperViewHolder(v)
    }

    override fun onBindViewHolder(holder: WallPaperViewHolder, position: Int) {
        val newListWall = wallImgLis[position]
        holder.wallPaperImg.setImageResource(newListWall.wallImg)
        holder.wallPaperImg.setOnClickListener {
            val wallInt = Intent(c, MainActivity::class.java)
            wallInt.putExtra("wallImg",newListWall.wallImg)
            c.startActivity(wallInt)
        }
    }

    override fun getItemCount(): Int = wallImgLis.size
}