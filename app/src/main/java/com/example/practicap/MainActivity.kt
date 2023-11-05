package com.example.practicap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user: EditText = findViewById(R.id.txtUser)
        val pass: EditText = findViewById(R.id.txtPass)
        val auth = FirebaseAuth.getInstance()
        val btnR: Button = findViewById(R.id.btnRegister)




        val btnLog: Button = findViewById(R.id.btnLog)

        btnR.setOnClickListener{
            startActivity(Intent(this, RegisterActivity ::class.java))

        }



        btnLog.setOnClickListener {
            val correo: String = user.text.toString()
            val clave: String =  pass.text.toString()
            auth.signInWithEmailAndPassword(correo, clave)
                .addOnCompleteListener(this){task->
                    if(task.isSuccessful){
                        Snackbar
                            .make(
                                findViewById(android.R.id.content)
                                ,"Inicio de sesión exitoso"
                                , Snackbar.LENGTH_LONG
                            ).show()
                        startActivity(Intent(this, OpcionesActivity ::class.java))
                    }else {
                        Snackbar
                            .make(
                                findViewById(android.R.id.content)
                                ,"Credenciales inválidas"
                                , Snackbar.LENGTH_LONG
                            ).show()
                    }
                }
        }
    }

}

