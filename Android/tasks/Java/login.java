package com.cypher.tasks;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    Button log;
    String user_name_check, email_check, pass_check, email_main, pass_main;
    EditText email, pass;
    SharedPreferences sp;
    boolean check_log;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        log = (Button) findViewById(R.id.log);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        sp = getSharedPreferences("pname", MODE_PRIVATE);

        user_name_check = sp.getString("username", "abc");
        email_check = sp.getString("email", "abc@gmail.com");
        pass_check = sp.getString("pass", "12345678");

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email_main = email.getText().toString();
                pass_main = pass.getText().toString();

                if (email_check.equals(email_main) && pass_check.equals(pass_main)) {
                    SharedPreferences.Editor editor = sp.edit();
                    editor.putBoolean("islog", true);
                    editor.commit();
                    Intent intent = new Intent(login.this, confirm.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(login.this, "false", Toast.LENGTH_SHORT).show();
                }
            }
        });

        check_log = sp.getBoolean("islog", false);
        if (check_log) {
            Intent intent = new Intent(login.this, confirm.class);
            startActivity(intent);
            finish();
        }

    }
}
