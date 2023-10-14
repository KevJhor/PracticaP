package com.example.practicap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class IMCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imcactivity)

        val btnBackMenu: Button = findViewById(R.id.btnBackMenuP)
        btnBackMenu.setOnClickListener {
            val intent1 = Intent(this,OpcionesActivity::class.java)
            startActivity(intent1)
        }

        val peso: TextView = findViewById(R.id.txtPeso)
        val IMC: TextView = findViewById(R.id.txtCatIMC)
        val ValIMC: TextView = findViewById(R.id.txtRIMC)
        val estatura: TextView = findViewById(R.id.txtEstatura)

        val btnCalcIMC: Button = findViewById(R.id.btnCalIMC)
        btnCalcIMC.setOnClickListener{
            val CalImc = peso.text.toString().toDouble()/(estatura.text.toString().toDouble()*estatura.text.toString().toDouble())
            ValIMC.text = CalImc.toString()
            if(CalImc <18.5){
                IMC.text = "Bajo peso"
            }
            else if(CalImc in 18.5..24.9){
                IMC.text = "Peso saludable"
            }
            else if(CalImc in 25.0..29.9){
                IMC.text = "Sobrepeso"
            }
            else{
                IMC.text = "Obesidad"
            }
        }



    }
}