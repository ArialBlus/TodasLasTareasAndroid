package com.example.list;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String[] datos = {"Nicaragua", "Guatemala", "Estados Unidos ", "Australia ", "Aprendimos algo?"};

        // Adaptador para la lista
        ArrayAdapter<String> adaptador = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, datos);

        // Obtener el ListView
        ListView listView = findViewById(R.id.listView);

        // Asignar el adaptador al ListView
        listView.setAdapter(adaptador);
    }
}