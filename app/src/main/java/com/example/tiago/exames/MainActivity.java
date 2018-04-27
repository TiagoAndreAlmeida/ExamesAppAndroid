package com.example.tiago.exames;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*Quando não consegue acessar o serviço Activity Details chama essa activity passando
        o parametro net como true, esse bloco que codigo verifica e mostra a mensagem para o usuário */
        Bundle extras = getIntent().getExtras();
        if(extras != null && extras.getBoolean("net")){
            Toast alert = Toast.makeText(this, "Serviço indisponível", Toast.LENGTH_LONG);
            alert.setGravity(Gravity.CENTER_VERTICAL|Gravity.CENTER_HORIZONTAL,0,0);
            alert.show();
        }


        //Botões com imagens
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

        //Icone de email na tela
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
