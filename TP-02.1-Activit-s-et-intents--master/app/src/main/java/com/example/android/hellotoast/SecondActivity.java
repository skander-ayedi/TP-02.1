package com.example.android.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView texte1;
    TextView texte2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle extras= getIntent().getExtras();
        String message2 = extras.getString("key2");
        String message = extras.getString("key1");
        texte1=findViewById(R.id.textView);
        texte2=findViewById(R.id.textView3);
        texte1.setText(message);
        texte2.setText(message2);
    }
}