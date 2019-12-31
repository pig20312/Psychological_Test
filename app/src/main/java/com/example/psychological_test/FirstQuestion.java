package com.example.psychological_test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.TextView;

import java.util.ArrayList;

public class FirstQuestion extends AppCompatActivity {

    static int layer_index = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        TextView title = findViewById(R.id.first_Ques);
        TextView des = findViewById(R.id.first_Ques_Des);

        Switch(layer_index){
            case 1:
                title.setText("第一題");
                des.setText("fxck");
            default:
                title.setText("第一題");
                des.setText("fxck");
        }


        ListView listview = findViewById(R.id.ans_list);

        ArrayAdapter<Answer> listAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, Answer.answers);
        listview.setAdapter(listAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(FirstQuestion.this, FirstAnswer.class);
                intent.putExtra("choice", i);
                intent.putExtra("layer", layer_index++);
//                intent.putExtra("leaveType", ansType.toArray(new String[0]));

                startActivity(intent);
            }
        };

        listview.setOnItemClickListener(itemClickListener);
    }
}
