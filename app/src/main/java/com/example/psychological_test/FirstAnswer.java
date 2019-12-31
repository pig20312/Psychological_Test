package com.example.psychological_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class FirstAnswer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_answer);

        Intent intent = getIntent();
        int type = intent.getIntExtra("choice", 0);
        int layer = intent.getIntExtra("layer", 0);

        TextView coffee_description = findViewById(R.id.FirstAns);
        coffee_description.setText(Answer.answers.get(type).getDes(layer));

        if (layer == 1)
            intent = new Intent(FirstAnswer.this, FirstQuestion.class);
        else if (layer == 2)
            intent = new Intent(FirstAnswer.this, FirstQuestion.class);
        else if (layer == 3)
            intent = new Intent(FirstAnswer.this, FirstQuestion.class);
        else if (layer == 4)
            intent = new Intent(FirstAnswer.this, FirstQuestion.class);
        else if (layer == 5)
            intent = new Intent(FirstAnswer.this, MainActivity.class);

        startActivity(intent);
    }
}
