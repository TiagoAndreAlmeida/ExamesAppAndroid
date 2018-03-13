package com.example.tiago.exames;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class Details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        Bundle extras = getIntent().getExtras();
        final TextView textView = (TextView) findViewById(R.id.text_details);
        String details = extras.getString("opt");

        textView.setText(Html.fromHtml(getString(R.string.opt_details, details)));

    }
}
