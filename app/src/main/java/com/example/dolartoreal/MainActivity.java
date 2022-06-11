package com.example.dolartoreal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void converter(View view) {

        EditText editDolar = findViewById(R.id.editDolar);
        EditText editCotacao = findViewById(R.id.editCotacao);
        TextView textResultado = findViewById(R.id.textResultado);

        Double valorDolar = Double.parseDouble(editDolar.getText().toString());
        Double valorCotacao = Double.parseDouble(editCotacao.getText().toString());

        Double valorConvertido = valorDolar * valorCotacao;
        textResultado.setText("Valor em R$ " +valorConvertido);

    }
}