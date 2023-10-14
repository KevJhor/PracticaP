package com.example.practicap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GeneracionAdapter(private val lstGen: List<GeneracionModel>) : RecyclerView.Adapter<GeneracionModel.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GeneracionModel.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return GeneracionModel.ViewHolder(layoutInflater.inflate(R.layout.recycler_view_item, parent, false))
    }

    override fun onBindViewHolder(holder: GeneracionModel.ViewHolder, position: Int) {
        val itemGen = lstGen[position]
        holder.image.setImageResource(itemGen.image)
        holder.genera.text = itemGen.generaName
        holder.fecha.text = itemGen.año

    }

    override fun getItemCount(): Int {
        return lstGen.size
    }

}