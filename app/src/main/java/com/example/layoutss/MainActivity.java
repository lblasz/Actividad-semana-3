
package com.example.layoutss; // Asegúrate que este sea tu paquete correcto

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextNombre;
    private Button buttonEnviarNombre;
    private EditText editTextApellido;
    private Button buttonEnviarApellido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNombre = findViewById(R.id.editTextNombre);
        buttonEnviarNombre = findViewById(R.id.buttonNombre);

        buttonEnviarNombre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nombreIngresado = editTextNombre.getText().toString();
                if (!nombreIngresado.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Nombre ingresado: " + nombreIngresado, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, ingresa un nombre", Toast.LENGTH_SHORT).show();
                }
            }
        });

        editTextApellido = findViewById(R.id.editTextApellido);
        buttonEnviarApellido = findViewById(R.id.buttonApellido);

        buttonEnviarApellido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String apellidoIngresado = editTextApellido.getText().toString();
                if (!apellidoIngresado.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Apellido ingresado: " + apellidoIngresado, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Por favor, ingresa un apellido", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
