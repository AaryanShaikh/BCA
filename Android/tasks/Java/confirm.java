package com.cypher.tasks;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class confirm extends AppCompatActivity {

    TextView username_text;
    SharedPreferences sp;
    Button click;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);

        username_text = (TextView) findViewById(R.id.username_text);
        sp = getSharedPreferences("pname", MODE_PRIVATE);
        click = (Button) findViewById(R.id.click);

        username_text.setText(sp.getString("username", "abc"));

        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(confirm.this)
                        .setTitle("Permission")
                        .setMessage("Please allow Storage Access!")
                        .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(confirm.this,testing.class);
                                startActivity(intent);
                            }
                        })
                        .setNegativeButton("no", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(confirm.this,"Access should be given to proceed!",Toast.LENGTH_SHORT).show();
                            }
                        })
                        .create()
                        .show();

            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(confirm.this, "you're back!", Toast.LENGTH_SHORT).show();
    }
}