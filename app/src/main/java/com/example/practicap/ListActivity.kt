package com.example.practicap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Toast

class ListActivity : AppCompatActivity() {
    var arrSO = arrayOf(
        "Android", "iPhone", "Windows Phone", "Blackberry", "Firefox OS", "Amazon World", "Nokia"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val lsvSistemasOperativos: ListView = findViewById(R.id.listA)
        val adaptador: Any? = ArrayAdapter<Any?>(this, android.R.layout.simple_list_item_1, arrSO)

        lsvSistemasOperativos.adapter = adaptador as ListAdapter?

        lsvSistemasOperativos.setOnItemClickListener { parent, view, position, id ->
            println("Aquí mostraré un mensaje al usuario")
            Toast.makeText(
                applicationContext, "La posición seleccionada es: $position", Toast.LENGTH_SHORT
            ).show()


        }
        val btnBack: Button = findViewById(R.id.btnRMA)
        btnBack.setOnClickListener {
            val intent1 = Intent(this,OpcionesActivity::class.java)
            startActivity(intent1)
        }
    }
}