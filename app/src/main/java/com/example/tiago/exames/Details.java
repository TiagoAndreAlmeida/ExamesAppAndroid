package com.example.tiago.exames;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.concurrent.ExecutionException;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        Bundle extras = getIntent().getExtras();
        String id = extras.getString("id");

        final TextView textFaixa = (TextView) findViewById(R.id.text_faixa);
        final TextView textDesc = (TextView) findViewById(R.id.text_desc);

        try{
            Exame res = new HttpService(id, this).execute().get();
            if(res != null) {
                textFaixa.setText(res.getFaixa());
                textDesc.setText(res.getDesc());
            }else {
                Intent intent = new Intent(this, MainActivity.class);
                intent.putExtra("net", true);
                startActivity(intent);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
