package com.cypher.tasks;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button reg;
    EditText username, email, pass;
    boolean check_reg;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reg = (Button) findViewById(R.id.reg);
        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        sp = getSharedPreferences("pname", MODE_PRIVATE);


        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, login.class);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("username", username.getText().toString());
                editor.putString("email", email.getText().toString());
                editor.putString("pass", pass.getText().toString());
                editor.putBoolean("isreg", true);
                editor.commit();
                startActivity(intent);
            }
        });
        check_reg = sp.getBoolean("isreg", false);
        if (check_reg) {
            Intent intent = new Intent(MainActivity.this, login.class);
            startActivity(intent);
            finish();
        }
    }
}
