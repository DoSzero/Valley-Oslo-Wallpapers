package com.voslowall.valleyoslowallpapers.view

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.voslowall.valleyoslowallpapers.R


class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        Handler(Looper.getMainLooper()).postDelayed({
           val intent = Intent(this, WallPaperActivity::class.java)
            startActivity(intent)
            finish()
        }, 1750)

    }
}