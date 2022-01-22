package com.dicoding.lombokspecialfoods.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.dicoding.lombokspecialfoods.R
import com.dicoding.lombokspecialfoods.data.Food

class FoodViewAdapter(private val listFood: ArrayList<Food>) : RecyclerView.Adapter<FoodViewAdapter.CardViewViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback
    private lateinit var onButtonClickCallback: OnItemClickCallback
    private lateinit var onFavoriteClickCallback: OnItemClickCallback


    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    fun setOnButtonClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onButtonClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.view_card_data, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int){
        val food = listFood[position]
        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail

        holder.itemView.setOnClickListener { onItemClickCallback.onItemClicked(listFood[holder.adapterPosition]) }
        //using button share to whatsApp!
        holder.btnShare.setOnClickListener {
            onButtonClickCallback.onItemClicked(listFood[holder.adapterPosition])
        }

    }


    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var btnShare: ImageButton = itemView.findViewById(R.id.btn_set_share)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
    }

    interface OnItemClickCallback {
        fun onItemClicked(data: Food)
    }
}
