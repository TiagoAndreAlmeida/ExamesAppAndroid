package com.example.tiago.exames;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class UrinaOptions extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urina_options);

        final Button coloracao = (Button) findViewById(R.id.coloracao_button);
        coloracao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UrinaOptions.this, Details.class);
                intent.putExtra("id", "coloracao");
                startActivity(intent);
            }
        });

        final Button bilirrubina = (Button) findViewById(R.id.bilirrubina_button);
        bilirrubina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UrinaOptions.this, Details.class);
                intent.putExtra("id", "bilirrubina");
                startActivity(intent);
            }
        });

        final Button acido_urico = (Button) findViewById(R.id.acidourico_button);
        acido_urico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UrinaOptions.this, Details.class);
                intent.putExtra("id", "acido-urico");
                startActivity(intent);
            }
        });

        final Button amilase = (Button) findViewById(R.id.amil_button);
        amilase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UrinaOptions.this, Details.class);
                intent.putExtra("id", "amilase");
                startActivity(intent);
            }
        });

        final Button ph = (Button) findViewById(R.id.ph_button);
        ph.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UrinaOptions.this, Details.class);
                intent.putExtra("id", "ph");
                startActivity(intent);
            }
        });

        final Button densidade = (Button) findViewById(R.id.densidade_button);
        densidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(UrinaOptions.this, Details.class);
                intent.putExtra("id", "densidade");
                startActivity(intent);
            }
        });
    }
}
