package com.cypher.college;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class progress extends AppCompatActivity {

    Button progress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);

        progress = (Button) findViewById(R.id.progress);

        progress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ProgressDialog progressBar = new ProgressDialog(progress.this);
                progressBar.setCancelable(true);
                progressBar.setMessage("Virus Loading......");
                progressBar.show();
                Toast.makeText(progress.this, "You were Fooled!", Toast.LENGTH_LONG).show();
                //progressBar.dismiss();
            }
        });
        Toast.makeText(progress.this, getIntent().getStringExtra("email"), Toast.LENGTH_SHORT).show();
    }
}
