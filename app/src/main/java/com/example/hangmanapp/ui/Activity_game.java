package com.example.hangmanapp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;


import com.example.hangmanapp.R;
import com.example.hangmanapp.ui.UI.Galgelogik;

public class Activity_game extends AppCompatActivity implements OnClickListener {
    private TextView wordField;
    private Button button;
    private EditText guessContainer;

    Galgelogik logik;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        logik = logik.getInstance();

        wordField = findViewById(R.id.wordField);
        button = findViewById(R.id.guessButton);
        guessContainer = findViewById(R.id.guessContainer);

        wordField.setText("You have to guess the word \"" + logik.getSynligtOrd() + "\" and you have used the following letters: " + logik.getBrugteBogstaver());
        logik.logStatus();

        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View isClicked) {
        String guess = guessContainer.getText().toString();
        System.out.println(guess);
        logik.gætBogstav(guess);

        if (logik.erSpilletTabt()) {
            Intent intent = new Intent(Activity_game.this,Finish.class);
            startActivity(intent);
        } else if (logik.erSpilletVundet()) {
            Intent intent = new Intent(Activity_game.this,Finish.class);
            startActivity(intent);
        } else {
            wordField.setText("You have to guess the word \"" + logik.getSynligtOrd() + "\" and you have used the following letters: " + logik.getBrugteBogstaver());
        }
    }
}
