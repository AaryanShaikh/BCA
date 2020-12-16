package com.cypher.tasks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;

public class gridView extends AppCompatActivity {

    GridView grid;
    static final String[] numbers = new String[]{
            "1","2","3","4","5","6","7","8","9","10"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        grid = (GridView) findViewById(R.id.grid);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(gridView.this,
                android.R.layout.simple_list_item_1, numbers);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String str = ((TextView) view).getText().toString();
                int num=Integer.parseInt(str);
                boolean flag=true;
                for(int i=2; i<num; i++)
                {
                    if(num%i==0)
                    {
                        flag=false;
                    }
                }
                if (flag){
                    Toast.makeText(gridView.this,"prime",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(gridView.this,"not prime",Toast.LENGTH_SHORT).show();
                }
                /*Toast.makeText(gridView.this,((TextView) view).getText()/*String.valueOf(Position)*//*,Toast.LENGTH_LONG).show();*/
            }
        });
    }
}
