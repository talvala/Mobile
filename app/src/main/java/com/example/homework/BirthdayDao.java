package com.example.homework;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.OnConflictStrategy;

/**
 * Created by tal.valani on 07/05/2018.
 */

@Dao
public interface BirthdayDao {
    @Query("SELECT * from birthday")
    java.util.List<Birthday> getAllBirthdays();

    @Insert
    void insertAll(Birthday... birthdays);


}
