package com.voslowall.valleyoslowallpapers

import android.annotation.SuppressLint
import android.app.WallpaperManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.voslowall.valleyoslowallpapers.view.ShowDialog
import com.voslowall.valleyoslowallpapers.view.WallPaperActivity

class MainActivity : AppCompatActivity() , ShowDialog.ExampleDialogListener{

    private var bSetWallPaper: Button? = null
    private lateinit var wallImg: ImageView

    @SuppressLint("ShowToast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wallImg = findViewById(R.id.wallpaper_image)
        val wallInt = intent.extras
        val newWallImg = wallInt?.getInt("wallImg")
        if (newWallImg != null) {
            wallImg.setImageResource(newWallImg)
        }

        val wallPaperManager = WallpaperManager.getInstance(applicationContext)
        bSetWallPaper = findViewById(R.id.set_wallpaper_button)

        bSetWallPaper!!.setOnClickListener {
            openDialog()
            try {
                if (newWallImg != null) {
                    wallPaperManager.setResource(newWallImg)
                }
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }

        val btnBack = findViewById<FloatingActionButton>(R.id.btnBack)
        btnBack.setOnClickListener {
            val intent = Intent(this, WallPaperActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openDialog() {
        val dialog = ShowDialog()
        dialog.show(supportFragmentManager, "Dialog")
    }

    override fun onYesClicked() {
    }

}