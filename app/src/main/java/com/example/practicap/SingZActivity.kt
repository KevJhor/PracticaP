package com.example.practicap

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import java.time.LocalDate
import java.time.Month
import java.time.Period
import java.time.format.DateTimeFormatter

class SingZActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sing_zactivity)


        val btnBackMenu: Button = findViewById(R.id.btnBackMenP)
        btnBackMenu.setOnClickListener {
            val intent1 = Intent(this,OpcionesActivity::class.java)
            startActivity(intent1)
        }

        val fechaN: TextView = findViewById(R.id.textFechaN)
        val btnCal: Button = findViewById(R.id.btnConsultar)
        val edadText: TextView = findViewById(R.id.txtEdad)
        val signoText: TextView = findViewById(R.id.txtSign)
        val formaterFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy")





        btnCal.setOnClickListener {

            val fechaActual = LocalDate.now()
            val fechaNacimiento = LocalDate.parse(fechaN.text.toString(),formaterFecha)
            val periodo = Period.between(fechaNacimiento,fechaActual)


            val capIni = LocalDate.of(fechaNacimiento.year-1, 12, 22)
            val capFin = LocalDate.of(fechaNacimiento.year, 1, 20)

            val acuIni = LocalDate.of(fechaNacimiento.year, 1, 21)
            val acuFin = LocalDate.of(fechaNacimiento.year, 2, 19)

            val pisIni = LocalDate.of(fechaNacimiento.year, 2, 20)
            val pisFin = LocalDate.of(fechaNacimiento.year, 3, 20)

            val ariIni = LocalDate.of(fechaNacimiento.year, 3, 21)
            val ariFin = LocalDate.of(fechaNacimiento.year, 4, 20)

            val tauIni = LocalDate.of(fechaNacimiento.year, 4, 21)
            val tauFin = LocalDate.of(fechaNacimiento.year, 5, 21)

            val gemIni = LocalDate.of(fechaNacimiento.year, 5, 22)
            val gemFin = LocalDate.of(fechaNacimiento.year, 6, 21)

            val canIni = LocalDate.of(fechaNacimiento.year, 6, 22)
            val canFin = LocalDate.of(fechaNacimiento.year, 7, 22)

            val leoIni = LocalDate.of(fechaNacimiento.year, 7, 23)
            val leoFin = LocalDate.of(fechaNacimiento.year, 8, 22)

            val virIni = LocalDate.of(fechaNacimiento.year, 8, 23)
            val virFin = LocalDate.of(fechaNacimiento.year, 9, 22)

            val libIni = LocalDate.of(fechaNacimiento.year, 9, 23)
            val libFin = LocalDate.of(fechaNacimiento.year, 10, 22)

            val escIni = LocalDate.of(fechaNacimiento.year, 10, 23)
            val escFin = LocalDate.of(fechaNacimiento.year, 11, 22)

            val sagIni = LocalDate.of(fechaNacimiento.year, 11, 23)
            val sagFin = LocalDate.of(fechaNacimiento.year, 12, 21)
            val edad = periodo.years

            edadText.text = edad.toString()

            if(fechaNacimiento.isAfter(capIni) && fechaNacimiento.isBefore(capFin)){
                signoText.text = "Capricornio"
            }
            else if(fechaNacimiento.isAfter(acuIni) && fechaNacimiento.isBefore(acuFin)){
                signoText.text = "Acuario"
            }
            else if(fechaNacimiento.isAfter(pisIni) && fechaNacimiento.isBefore(pisFin)){
                signoText.text = "Piscis"
            }

            else if(fechaNacimiento.isAfter(ariIni) && fechaNacimiento.isBefore(ariFin)){
                signoText.text = "Aries"
            }

            else if(fechaNacimiento.isAfter(tauIni) && fechaNacimiento.isBefore(tauFin)){
                signoText.text = "Tauro"
            }
            else if(fechaNacimiento.isAfter(gemIni) && fechaNacimiento.isBefore(gemFin)){
                signoText.text = "Geminis"
            }
            else if(fechaNacimiento.isAfter(canIni) && fechaNacimiento.isBefore(canFin)){
                signoText.text = "Cancer"
            }
            else if(fechaNacimiento.isAfter(leoIni) && fechaNacimiento.isBefore(leoFin)){
                signoText.text = "Leo"
            }
            else if(fechaNacimiento.isAfter(virIni) && fechaNacimiento.isBefore(virFin)){
                signoText.text = "Virgo"
            }
            else if(fechaNacimiento.isAfter(libIni) && fechaNacimiento.isBefore(libFin)){
                signoText.text = "Libra"
            }
            else if(fechaNacimiento.isAfter(escIni) && fechaNacimiento.isBefore(escFin)){
                signoText.text = "Escorpio"
            }
            else if(fechaNacimiento.isAfter(sagIni) && fechaNacimiento.isBefore(sagFin)){
                signoText.text = "Sagitario"
            }
            else  signoText.text = "Signo Desconocido"
        }
    }
}