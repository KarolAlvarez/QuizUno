package com.i014114.quizuno;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        FloatingActionButton btnFloat= (FloatingActionButton)findViewById(R.id.floatbtnUno);
        btnFloat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cambiarALayoutDos(view);
            }
        });
    }


    public void cambiarALayoutDos(View vista) {
        Intent intent= new Intent(this,Main2Activity.class);
        startActivity(intent);
    }
}
