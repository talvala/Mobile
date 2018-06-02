package com.example.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;

public class Animation1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation1_main);

        clickNext();
    }




    private void clickNext() {
        RelativeLayout root = (RelativeLayout) findViewById(R.id.layout2);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Animation1Activity.this, Animation2Activity.class));

            }
        });
    }
}
