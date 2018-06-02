package com.example.homework;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by tal.valani on 07/05/2018.
 */

@Database(entities = {Birthday.class}, version=1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract BirthdayDao BirthdayDao();
}
