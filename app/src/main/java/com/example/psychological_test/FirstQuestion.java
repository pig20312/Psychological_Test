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

    static int layer_index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        TextView title = findViewById(R.id.first_Ques);
        TextView des = findViewById(R.id.first_Ques_Des);

        switch(layer_index){
            case 0:
                title.setText("第一排序");
                des.setText("你最常因為以下何者原因哭泣");
                break;
            case 1:
                title.setText("第二排序");
                des.setText("你常因為以下何者原因哭泣");
                break;
            case 2:
                title.setText("第三排序");
                des.setText("你平常會因為何者原因哭泣");
                break;
            case 3:
                title.setText("第四排序");
                des.setText("你不常為了何者原因哭泣");
                break;
            case 4:
                title.setText("第五排序");
                des.setText("你最不常因為何者原因哭泣");
                break;
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
                if(layer_index == 5)
                    layer_index = 0;

                startActivity(intent);
            }
        };

        listview.setOnItemClickListener(itemClickListener);
    }
}
