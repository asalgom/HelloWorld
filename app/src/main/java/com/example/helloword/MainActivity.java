package com.example.helloword;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
/**@author anton
 * @version
 * se ha visto como se usan los recursos en android studio ademas hemos isntanciado en java un objeto textview hemos personalizado la imagen de la aplicacion
Aplicacion de ejemplo que muestra el tipico hola mundo
 */

//// TODO: 26/09/2023 tengo que mirar sobre el temario de documentacion

public class MainActivity extends AppCompatActivity {
    // metodo principal
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewHola = findViewById(R.id.tvInicial);
        TextView textViewUltimo = findViewById(R.id.tvFinal);

        textViewHola.setTextColor(Color.CYAN);
        textViewUltimo.setTextColor(Color.MAGENTA);


    }
}