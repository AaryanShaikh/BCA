package com.cypher.programs;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class sharedpref extends AppCompatActivity {

    EditText email,pass;
    Button submit,show,next;
    TextView email_text,pass_text;
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sharedpref);

        email = (EditText) findViewById(R.id.email);
        pass = (EditText) findViewById(R.id.pass);
        submit = (Button) findViewById(R.id.submit);
        show = (Button) findViewById(R.id.show);
        next = (Button) findViewById(R.id.next);
        email_text = (TextView) findViewById(R.id.email_text);
        pass_text = (TextView) findViewById(R.id.pass_text);
        sp = getSharedPreferences("prefname",MODE_PRIVATE);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SharedPreferences.Editor editor = sp.edit();
                editor.putString("email",email.getText().toString());
                editor.putString("pass",pass.getText().toString());
                editor.commit();
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                email_text.setText(sp.getString("email","abc@gmail.com"));
                pass_text.setText(sp.getString("pass","12345678"));
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sharedpref.this,download.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
