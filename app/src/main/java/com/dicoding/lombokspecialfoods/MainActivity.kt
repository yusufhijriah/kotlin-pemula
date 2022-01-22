package com.dicoding.lombokspecialfoods

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dicoding.lombokspecialfoods.`object`.FoodData
import com.dicoding.lombokspecialfoods.data.Food
import com.dicoding.lombokspecialfoods.view.Detail
import com.dicoding.lombokspecialfoods.view.FoodViewAdapter
import com.dicoding.lombokspecialfoods.view.Profil

class MainActivity : AppCompatActivity() {
    private lateinit var rvViews: RecyclerView
    private var listFood: ArrayList<Food> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvViews = findViewById(R.id.rv_heroes)
        rvViews.setHasFixedSize(true)

        listFood.addAll(FoodData.listData)
        showRecyclerCardView()
    }

    private fun showRecyclerCardView() {
        rvViews.layoutManager = LinearLayoutManager(this)
        val cardViewFood = FoodViewAdapter(listFood)
        rvViews.adapter = cardViewFood

        cardViewFood.setOnItemClickCallback(object : FoodViewAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                showFoodSelected(data)
            }
        })

        cardViewFood.setOnButtonClickCallback(object : FoodViewAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Food) {
                sendMessage(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_list -> {
                myProfil()
            }
        }
    }

    private fun myProfil() {
        val intent = Intent(this, Profil::class.java)
        startActivity(intent)
    }

    private fun showFoodSelected(food: Food) {
        Toast.makeText(this, "Anda memilih " + food.name, Toast.LENGTH_SHORT).show()
        val moveData = Intent(this, Detail::class.java)
        moveData.putExtra(Detail.EXTRA_NAME, food.name)
        moveData.putExtra(Detail.EXTRA_IMAGE, food.photo)
        moveData.putExtra(Detail.EXTRA_DETAIL, food.detail)
        startActivity(moveData)
    }

    private fun sendMessage(food: Food) {
        val judul = food.name
        val detail = food.detail

        val message = "Nama Makanan : *$judul*,\n \n$detail"

        val intent = Intent(Intent.ACTION_SEND)
        intent.putExtra(Intent.EXTRA_TEXT, message)
        intent.type = "text/plain"

        startActivity(Intent.createChooser(intent, "Mengirim menggunakan ..."))

    }
}
