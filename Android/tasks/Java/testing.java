package com.cypher.tasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

public class testing extends AppCompatActivity {

    Switch check;
    RelativeLayout main;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        check = (Switch) findViewById(R.id.check);
        main = (RelativeLayout) findViewById(R.id.main);

        check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                    Toast.makeText(testing.this,"NightMode on",Toast.LENGTH_SHORT).show();
                    main.setBackgroundColor(getResources().getColor(R.color.black));
                    check.setTextColor(getResources().getColor(R.color.white));
                }
                else {
                    Toast.makeText(testing.this,"NightMode off",Toast.LENGTH_SHORT).show();
                    main.setBackgroundColor(getResources().getColor(R.color.white));
                    check.setTextColor(getResources().getColor(R.color.black));
                }
            }
        });


    }
}
