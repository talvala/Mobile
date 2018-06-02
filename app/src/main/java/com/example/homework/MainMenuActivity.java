package com.example.homework;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MainMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        Toolbar myToolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(myToolbar);

    }

    public void onCalcClicked(View view) {
        startActivity(new Intent(this, CalculatorActivity.class));
    }

    public void onLayoutAnimationClicked(View view) {
        startActivity(new Intent(this, AnimationActivity.class));
    }

    public void onBirthdayClicked(View view) {
        startActivity(new Intent(this, BirthdayActivity.class));
    }
}
