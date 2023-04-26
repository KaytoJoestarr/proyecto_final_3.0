package com.example.proyecto_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

class IntegrantesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_integrantes)

        //Editar Perfil
        val btn2 = findViewById<Button>(R.id.botonEditar)
        btn2.setOnClickListener {
            val intent = Intent(this, CrearPerfilActivity::class.java)
            Toast.makeText(this, "Editar selected", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }

        val btn3 = findViewById<ImageView>(R.id.mascotaAddBoton)
        btn3.setOnClickListener {
            val intent = Intent(this, AgregarMascotaActivity::class.java)
            Toast.makeText(this, "Editar selected", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }

        //Volver
        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {

            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}