package com.example.homework;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class BirthdayActivity extends AppCompatActivity {

    private static final String TAG = "MainActicity";

    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    FloatingActionButton fab;
 //   ArrayList<Birthday> birthdays;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.birthday_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        recyclerView = findViewById(R.id.recycler_view);

     //   birthdays = new ArrayList<>();

     //      for (int i = 0; i<10 ; i++){
    //        Birthday birthday = new Birthday(i,"Tal", "25.12.90");
    //         birthdays.add(birthday);
        //     }

        AppDatabase db = Room.databaseBuilder(getApplicationContext(),AppDatabase.class, "production").allowMainThreadQueries().build();
        java.util.List<Birthday> birthdays = db.BirthdayDao().getAllBirthdays();


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BirthdayAdapter(birthdays);
        recyclerView.setAdapter(adapter);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new android.content.Intent (BirthdayActivity.this, CreateBirthday.class));
            }
        });
    }
}
