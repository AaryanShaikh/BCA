package com.cypher.programs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button count_alpha, count_num, next;
    TextView count_alpha_text, count_num_text;
    int i = 0;
    char ch = 'a';

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count_alpha = (Button) findViewById(R.id.count_alpha);
        count_num = (Button) findViewById(R.id.count_num);
        next = (Button) findViewById(R.id.next);
        count_alpha_text = (TextView) findViewById(R.id.count_alpha_text);
        count_num_text = (TextView) findViewById(R.id.count_num_text);

        count_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                count_num_text.setText(String.valueOf(i));
            }
        });

        count_num.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                i = 0;
                count_num_text.setText(String.valueOf(i));
                Toast.makeText(MainActivity.this,"Number Reset!",Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        count_alpha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ch++;
                count_alpha_text.setText(String.valueOf(ch));
            }
        });

        count_alpha.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                ch = 'a';
                count_alpha_text.setText(String.valueOf(ch));
                Toast.makeText(MainActivity.this,"character Reset!",Toast.LENGTH_SHORT).show();
                return true;
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this,sharedpref.class);
                startActivity(intent);

            }
        });


    }
}
