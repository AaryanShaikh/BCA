package com.cypher.programs;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class download extends AppCompatActivity {

    Button download;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_download);

        download = (Button) findViewById(R.id.download);

        download.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               ProgressDialog pd = new ProgressDialog(download.this);
               pd.setCancelable(true);
               pd.setMessage("downloading.....");
               pd.show();

            }
        });

    }
}
