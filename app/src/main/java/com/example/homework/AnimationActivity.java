package com.example.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.RelativeLayout;


public class AnimationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.animation_main);

       // configureNextButton();
        clickNext();

    }

/*
private void configureNextButton(){
TextView nextText = (TextView) findViewById(R.id.textView17);
nextText.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View view) {
startActivity(new Intent(AnimationActivity.this, Animation1Activity.class));
}
});
}
*/


    private void clickNext() {
        RelativeLayout root = (RelativeLayout) findViewById(R.id.layout1);
        root.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AnimationActivity.this, Animation1Activity.class));

            }
        });
    }
}
