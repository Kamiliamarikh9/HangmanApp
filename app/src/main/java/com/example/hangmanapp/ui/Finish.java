package com.example.hangmanapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.hangmanapp.R;
import com.example.hangmanapp.ui.UI.Galgelogik;

public class Finish extends AppCompatActivity {
    private TextView endText;
    Galgelogik logik;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish);
        endText = findViewById(R.id.end);

        logik = logik.getInstance();

        if(logik.erSpilletVundet()) {
            endText.setText("You won!");
        } else {
            endText.setText("You lost!");
        }
    }
}
