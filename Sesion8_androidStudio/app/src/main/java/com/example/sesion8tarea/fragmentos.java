package com.example.sesion8tarea;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fragmentos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragmentos2);
    }
    public void regresa(View view){
        Intent menu = new Intent(this, MainActivity.class);
        startActivity(menu);
    }
}