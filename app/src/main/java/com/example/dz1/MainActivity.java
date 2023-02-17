package com.example.dz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Next(View v){
        Intent a = new Intent(v.getContext(), Second.class);
        EditText text = findViewById(R.id.field);
        a.putExtra("Info", text.getText().toString());
        startActivity(a);
    }
}