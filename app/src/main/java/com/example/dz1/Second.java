package com.example.dz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent get_text = getIntent();
        TextView text = findViewById(R.id.text);
        text.setText(get_text.getStringExtra("Info"));
    }
}