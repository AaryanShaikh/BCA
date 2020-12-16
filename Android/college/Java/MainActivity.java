package com.cypher.college;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button, reset, add, sub, check, down;
    TextView text1, text2, counter, res_text;
    int i = 0, k = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        text1 = (TextView) findViewById(R.id.text);
        text2 = (TextView) findViewById(R.id.text2);
        reset = (Button) findViewById(R.id.reset);
        counter = (TextView) findViewById(R.id.counter);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        check = (Button) findViewById(R.id.check);
        res_text = (TextView) findViewById(R.id.res_text);
        down = (Button) findViewById(R.id.down);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k == 0) {
                    Toast.makeText(MainActivity.this, "Text Changed!", Toast.LENGTH_SHORT).show();
                    text1.setText("with Java");
                    text2.setText("Programming");
                    k = 1;
                } else {
                    text1.setText("Android");
                    text2.setText("Program");
                    k = 0;
                    Toast.makeText(MainActivity.this, "Text Reset!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = 0;
                counter.setText(String.valueOf(i));
                Toast.makeText(MainActivity.this, "Counter Reset!", Toast.LENGTH_SHORT).show();
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i++;
                counter.setText(String.valueOf(i));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i--;
                counter.setText(String.valueOf(i));
            }
        });

        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Long Press to Remove!", Toast.LENGTH_SHORT).show();
                if (i % 2 == 0 && i > 0) {
                    res_text.setText("This is a Positive Even number");
                } else if (i % 2 != 0 && i > 0) {
                    res_text.setText("This is a Positive Odd number");
                } else if (i == 0) {
                    res_text.setText("This is Zero");
                } else {
                    res_text.setText("This is a Negative number");
                }
            }
        });

        check.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                res_text.setText("");
                return true;
            }
        });

        down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,progress.class);
                startActivity(intent);
            }
        });

    }
}
