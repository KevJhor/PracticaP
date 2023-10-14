package com.example.practicap

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

data class GeneracionModel(val id: Int,
                           val image: Int,
                           val generaName: String,
                           val año: String
                           ) {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.imgG)
        val genera: TextView = itemView.findViewById(R.id.txtGeneracion)
        val fecha: TextView = itemView.findViewById(R.id.txtFecha)


    }
}
