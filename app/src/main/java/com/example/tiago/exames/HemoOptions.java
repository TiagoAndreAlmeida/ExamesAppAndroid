package com.example.tiago.exames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HemoOptions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hemograma_options);

        final Button hemoglobina_button = (Button) findViewById(R.id.hemoglobina_button);
        hemoglobina_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "hemoglobina");
                startActivity(intent);
            }
        });

        final Button rdw_button = (Button) findViewById(R.id.rdw_button);
        rdw_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "rdw");
                startActivity(intent);
            }
        });

        final Button vcm_button = (Button) findViewById(R.id.vcm_button);
        vcm_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "vcm");
                startActivity(intent);
            }
        });

        final Button hmc_button = (Button) findViewById(R.id.hmc_button);
        hmc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "hmc");
                startActivity(intent);
            }
        });

        final Button plaquetas_button = (Button) findViewById(R.id.plaquetas_button);
        plaquetas_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "plaquetas");
                startActivity(intent);
            }
        });

        final Button leucocitos_button = (Button) findViewById(R.id.leococitos_button);
        leucocitos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "leucocitos-totais");
                startActivity(intent);
            }
        });

        final Button basofilos_button = (Button) findViewById(R.id.basofilos_button);
        basofilos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "basofilos");
                startActivity(intent);
            }
        });

        final Button eosinofilos_button = (Button) findViewById(R.id.eosinofilos_button);
        eosinofilos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "eosinofilos");
                startActivity(intent);
            }
        });

        final Button neutrofilos_button = (Button) findViewById(R.id.neutrofilos_button);
        neutrofilos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "neutrofilos");
                startActivity(intent);
            }
        });

        final Button linfocitos_button = (Button) findViewById(R.id.linfocitos_button);
        linfocitos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "linfocitos");
                startActivity(intent);
            }
        });

        final Button monocitos_button = (Button) findViewById(R.id.monocitos_button);
        monocitos_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HemoOptions.this, Details.class);
                intent.putExtra("id", "monocitos");
                startActivity(intent);
            }
        });
    }
}
