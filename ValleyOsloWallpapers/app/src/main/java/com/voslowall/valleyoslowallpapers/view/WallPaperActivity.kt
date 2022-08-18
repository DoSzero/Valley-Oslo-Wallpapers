package com.voslowall.valleyoslowallpapers.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.voslowall.valleyoslowallpapers.model.WallPaperData
import com.voslowall.valleyoslowallpapers.R.*
import com.voslowall.valleyoslowallpapers.adapter.WallPaperAdapter


class WallPaperActivity : AppCompatActivity() {

    private lateinit var wallPaperAdapter: WallPaperAdapter
    private lateinit var wallImgList: ArrayList<WallPaperData>
    private lateinit var wallPaperRec: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_wall_paper)

        wallPaperRec = findViewById(id.wallRec)
        wallImgList = ArrayList()
        wallPaperAdapter = WallPaperAdapter(this, wallImgList)

        val layoutM = GridLayoutManager(applicationContext, 2)
        layoutM.orientation = LinearLayoutManager.VERTICAL
        wallPaperRec.layoutManager = layoutM
        wallPaperRec.adapter = wallPaperAdapter
        wallPaperList()
    }

    private fun wallPaperList() {
        wallImgList.add(WallPaperData(drawable.ic_oslo1))
        wallImgList.add(WallPaperData(drawable.ic_oslo2))
        wallImgList.add(WallPaperData(drawable.ic_oslo3))
        wallImgList.add(WallPaperData(drawable.ic_oslo4))
        wallImgList.add(WallPaperData(drawable.ic_oslo5))
        wallImgList.add(WallPaperData(drawable.ic_oslo6))
        wallImgList.add(WallPaperData(drawable.ic_oslo7))
        wallImgList.add(WallPaperData(drawable.ic_oslo8))
        wallImgList.add(WallPaperData(drawable.ic_oslo9))
        wallImgList.add(WallPaperData(drawable.ic_oslo10))
        wallImgList.add(WallPaperData(drawable.ic_oslo11))
        wallImgList.add(WallPaperData(drawable.ic_oslo12))
        wallImgList.add(WallPaperData(drawable.ic_oslo13))
        wallImgList.add(WallPaperData(drawable.ic_oslo14))
        wallImgList.add(WallPaperData(drawable.ic_oslo15))
        wallImgList.add(WallPaperData(drawable.ic_oslo16))
        wallImgList.add(WallPaperData(drawable.ic_oslo17))
        wallImgList.add(WallPaperData(drawable.ic_oslo18))
        wallImgList.add(WallPaperData(drawable.ic_oslo19))
        wallImgList.add(WallPaperData(drawable.ic_oslo20))
        wallImgList.add(WallPaperData(drawable.ic_oslo21))
        wallImgList.add(WallPaperData(drawable.ic_oslo22))
        wallImgList.add(WallPaperData(drawable.ic_oslo23))
        wallImgList.add(WallPaperData(drawable.ic_oslo24))
        wallImgList.add(WallPaperData(drawable.ic_oslo25))
        wallImgList.add(WallPaperData(drawable.ic_oslo26))
        wallImgList.add(WallPaperData(drawable.ic_oslo27))
        wallImgList.add(WallPaperData(drawable.ic_oslo28))
        wallImgList.add(WallPaperData(drawable.ic_oslo29))
    }

}