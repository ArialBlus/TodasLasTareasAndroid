package com.example.sesion8tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button fra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fra= findViewById(R.id.idfragmentos);
    }

    public void fragementado(View view){
        Intent fragmen = new Intent(this, fragmentos.class);
        startActivity(fragmen);
    }

    //botn de la lista
    public void ListView(View view){
        Intent camerun = new Intent(this, lista.class);
        startActivity(camerun);
    }

}