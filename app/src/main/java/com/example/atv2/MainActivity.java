package com.example.atv2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText edtNota1, edtNota2, edtNota3, edtNota4;
    private Button btnCalcular;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        edtNota1 = findViewById(R.id.edtNota1);
        edtNota2 = findViewById(R.id.edtNota2);
        edtNota3 = findViewById(R.id.edtNota3);
        edtNota4 = findViewById(R.id.edtNota4);
        btnCalcular = findViewById(R.id.btnCalcular);
        txtResultado = findViewById(R.id.txtResultado);
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double nota1 = Double.parseDouble(edtNota1.getText().toString());
                double nota2 = Double.parseDouble(edtNota2.getText().toString());
                double nota3 = Double.parseDouble(edtNota3.getText().toString());
                double nota4 = Double.parseDouble(edtNota4.getText().toString());
                double media = (nota1 + nota2 + nota3 + nota4) / 4;

                txtResultado.setText("Média: " + media);
            }
        });
    }
}
