package com.example.proyecto_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class AgregarMascotaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_mascota)


        val btn2 = findViewById<Button>(R.id.botonContinuar)
        btn2.setOnClickListener {
            val intent = Intent(this, IntegrantesActivity::class.java)
            Toast.makeText(this, "Editar selected", Toast.LENGTH_SHORT).show()
            startActivity(intent)



        //Volver
        val backButton: ImageButton = findViewById(R.id.backButton)
        backButton.setOnClickListener {

            val intent = Intent(this, IntegrantesActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
}