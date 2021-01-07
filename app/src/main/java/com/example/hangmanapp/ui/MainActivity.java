package com.example.hangmanapp.ui;

import android.content.Intent;
import android.os.Bundle;

import com.example.hangmanapp.R;
import com.example.hangmanapp.ui.UI.Galgelogik;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    private EditText editText;
    Galgelogik galgelogik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        galgelogik = galgelogik.getInstance();

        button = findViewById(R.id.normalGame);

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View clicked) {
        Intent intent = new Intent(MainActivity.this,Activity_game.class);
        startActivity(intent);
    }
}

