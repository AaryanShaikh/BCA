package com.cypher.college;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class shared_preferences extends AppCompatActivity {

    Button log, show_detail, next;
    EditText email, pass;
    TextView op_email, op_pass;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_preferences);

        log = (Button) findViewById(R.id.log);
        show_detail = (Button) findViewById(R.id.show_detail);
        next = (Button) findViewById(R.id.next);
        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        op_email = (TextView) findViewById(R.id.op_email);
        op_pass = (TextView) findViewById(R.id.op_pass);
        sp = getSharedPreferences("pref", Context.MODE_PRIVATE);

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("email", email.getText().toString());
                editor.putString("pass", pass.getText().toString());
                editor.commit();
                Toast.makeText(shared_preferences.this,"Details Saved!",Toast.LENGTH_SHORT).show();
            }
        });

        show_detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                op_email.setText(sp.getString("email", "abc@gmail.com"));
                op_pass.setText(sp.getString("pass", "123456"));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(shared_preferences.this, progress.class);
                intent.putExtra("email",email.getText().toString());
                startActivity(intent);
                finish();
            }
        });
    }
}