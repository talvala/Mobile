package com.example.homework;


import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

/**
 * Created by tal.valani on 07/05/2018.
 */

public class CreateBirthday extends AppCompatActivity {

    private static final String TAG = "CreateBirthday";

    EditText name;
    EditText date;
    android.widget.Button button;


    @Override
    protected void onCreate(@Nullable android.os.Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_birthday);

        name = findViewById(R.id.name);
        date = findViewById(R.id.date);
        button = findViewById(R.id.button);

        final AppDatabase db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class, "production").allowMainThreadQueries().build();

        button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: name: " + name.getText().toString());


                Birthday birthday = new Birthday(name.getText().toString(), date.getText().toString());
                db.BirthdayDao().insertAll(birthday);
                startActivity(new Intent (CreateBirthday.this, BirthdayActivity.class ));

            }
        });

    }
}
