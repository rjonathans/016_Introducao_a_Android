package com.example.meuapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Linear_layout_usando_peso_weight extends AppCompatActivity {

    private Button btnFrame;
    private Button btnRelative;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_usando_peso_weight);

        btnFrame = findViewById(R.id.btnFrameLayout);
        btnRelative = findViewById(R.id.btnRelativeLayout);

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Linear_layout_usando_peso_weight.this,FrameLayoutActivity.class));
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Linear_layout_usando_peso_weight.this,RelativeLayoutActivity.class));
            }
        });



    }
}
