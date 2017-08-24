package com.i014114.quizuno;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button mibotonUno= (Button) findViewById(R.id.mopciones);
        registerForContextMenu(mibotonUno);

    }




    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menInflater= getMenuInflater();
        menu.setHeaderTitle("mi menu de opciones");
        menInflater.inflate(R.menu.mimenu,menu);
    }








}
