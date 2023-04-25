package com.example.proyecto_final;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class CrearPerfilActivity extends AppCompatActivity {

    ImageButton btn_atras;
    Button btn_continuar;

    @SuppressLint("MissingInflatedId")
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_perfil);

        btn_atras = findViewById(R.id.btn_atras);
        btn_continuar = findViewById(R.id.btn_continuar);

        btn_atras.setOnClickListener(new View.OnClickListener() { // Boton Atras
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CrearPerfilActivity.this, CrearCuentaActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btn_continuar.setOnClickListener(new View.OnClickListener() { // Boton Continuar
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CrearPerfilActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
