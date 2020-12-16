package com.cypher.sandeep;

import android.Manifest;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int STORAGE_PERMISSION_CODE = 1;
    ImageButton call;
    Button payment,license;
    TextView licence_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        call = findViewById(R.id.call);
        payment = findViewById(R.id.payment);
        license = findViewById(R.id.licence);
        licence_text = findViewById(R.id.licence1);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:9762663528"));
                startActivity(callIntent);
            }
        });

        payment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainUi.class);
                startActivity(intent);
            }
        });

        license.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                licence_text.setText("Upload your Licence over on this Whatsapp number:9762663528");
            }
        });

        //code for runtime permission granting!
        if (ContextCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_GRANTED){
            Toast.makeText(MainActivity.this,"You've already granted this permission!",Toast.LENGTH_SHORT).show();
        }
        else {
            requestCallPermission();
        }
        Toast.makeText(MainActivity.this,"Touch the Book Vehicle button to call!",Toast.LENGTH_LONG).show();
    }
    private void requestCallPermission(){
        if (ActivityCompat.shouldShowRequestPermissionRationale(this, Manifest.permission.CALL_PHONE)){

            new AlertDialog.Builder(this)
                    .setTitle("Why to allow Permission?")
                    .setMessage("To call through the app, the app requires call permission or else the app may fail")
                    .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CALL_PHONE}, STORAGE_PERMISSION_CODE);
                        }
                    })
                    .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    })
                    .create()
                    .show();
        }
        else {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE}, STORAGE_PERMISSION_CODE);
        }
    }
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
     if(requestCode == STORAGE_PERMISSION_CODE){
         if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
             Toast.makeText(this,"Permission Granted!",Toast.LENGTH_SHORT).show();
         }
         else {
             Toast.makeText(this,"Permission not Granted!",Toast.LENGTH_SHORT).show();
         }
     }
    }
    //end of code for runtime permission granting!!
}
