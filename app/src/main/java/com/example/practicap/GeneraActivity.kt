package com.example.practicap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GeneraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_genera)

        val btnBackMenu: Button = findViewById(R.id.btnMP)
        btnBackMenu.setOnClickListener {
            val intent1 = Intent(this,OpcionesActivity::class.java)
            startActivity(intent1)
        }

        val rvEstab: RecyclerView = findViewById(R.id.rwGenera)
        rvEstab.layoutManager = LinearLayoutManager(this)
        rvEstab.adapter = GeneracionAdapter(ListEstablecimiento())

    }

    private fun ListEstablecimiento(): List<GeneracionModel>{
        val lstEstab: ArrayList<GeneracionModel> = ArrayList()

        lstEstab.add(GeneracionModel(1,R.drawable.logo,"Generación Z","2001-2023"))
        lstEstab.add(GeneracionModel(2,R.drawable.logo,"Milenials","1981-2000"))
        lstEstab.add(GeneracionModel(1,R.drawable.logo,"Generación X","1965-1980"))
        lstEstab.add(GeneracionModel(2,R.drawable.logo,"Baby Boomers","1946-1964"))

        return lstEstab
    }
}