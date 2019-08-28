package com.example.meuapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;
    private EditText editTextNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView) findViewById(R.id.texto_Ola_Mundo);
        button = (Button) findViewById(R.id.botao_main);
        editTextNome = findViewById(R.id.edit_text_nome);

        final Editable nome = editTextNome.getText();


        button.setOnClickListener(new View.OnClickListener() {//ele escuta o que esse botão esta fazendo
            @Override
            public void onClick(View v) {

                mostraNome(nome.toString());

            }
        });


    }

    public void mostraNome(String nomeUser) {
        Toast.makeText(getApplicationContext(), "Olá usuário: " + nomeUser, Toast.LENGTH_LONG).show();
    }
}
