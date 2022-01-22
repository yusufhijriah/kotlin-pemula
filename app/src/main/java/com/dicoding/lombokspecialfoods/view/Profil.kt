package com.dicoding.lombokspecialfoods.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.dicoding.lombokspecialfoods.R

class Profil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        val actionbar = supportActionBar
        actionbar!!.title = " "
        actionbar.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}