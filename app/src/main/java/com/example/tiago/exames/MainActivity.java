package com.example.tiago.exames;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ImageButton hemo_button = (ImageButton) findViewById(R.id.hemograma_button);
        hemo_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HemoOptions.class);
                startActivity(intent);
            }
        });

        final ImageButton urina_button = (ImageButton) findViewById(R.id.urina_button);
        urina_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, UrinaOptions.class);
                startActivity(intent);
            }
        });

        final FloatingActionButton email_button = (FloatingActionButton) findViewById(R.id.email_button);
        email_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String [] {"tiagoalmeida@aluno.fgf.edu.br"});
                startActivity(Intent.createChooser(intent, "Enviar email"));
            }
        });
    }
}
