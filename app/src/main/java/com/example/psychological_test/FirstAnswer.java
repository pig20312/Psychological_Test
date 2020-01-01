package com.example.psychological_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FirstAnswer extends AppCompatActivity {

    int layer = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_answer);

        Intent intent = getIntent();
        int type = intent.getIntExtra("choice", 0);
        layer = intent.getIntExtra("layer", 0);

        TextView FirstAns = findViewById(R.id.FirstAns);
        FirstAns.setText(Answer.answers.get(type).getDes(layer));



    }

    public void onClickＮextBtn(View view){

        Intent intent = new Intent(FirstAnswer.this, FirstQuestion.class);
        if(layer == 4) {
            intent = new Intent(FirstAnswer.this, MainActivity.class);
        }
        startActivity(intent);
    }
}
