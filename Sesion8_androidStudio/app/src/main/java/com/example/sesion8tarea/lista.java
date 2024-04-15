package com.example.sesion8tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class lista extends AppCompatActivity {

    private TextView lvt1;
    private ListView list1;

   private String Nombres[]={"Nicaragua", "cuba", "Costa rica", "Venezuela"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lvt1=findViewById(R.id.lvt1);
        list1=findViewById(R.id.list1);

        ArrayAdapter<String> list = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, Nombres);
        list1.setAdapter(list);

        list1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                lvt1.setText("El siguiente pais consume Nacatamal: " +list1.getItemAtPosition(i).toString());

            }
        });


    }
}