package com.example.homework;


import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by tal.valani on 07/05/2018.
 */

@Entity
public class Birthday {

    public Birthday(String name, String date) {
        this.name = name;
        this.date = date;
    }

    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "name")
    private String name;
    @ColumnInfo(name = "date")
    private String date;

    @Override
    public String toString() {
        return "Birthday{" +
                "id=" + id +
                ", mDate='" + date + '\'' +
                ", mName='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
