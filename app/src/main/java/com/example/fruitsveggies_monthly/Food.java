package com.example.fruitsveggies_monthly;

import android.os.Parcelable;
import android.os.Parcel;


public class Food implements Parcelable {

    private int drawablePath;
    private String name;
    private int month;

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public Food createFromParcel(Parcel in) {
            return new Food(in);
        }

        public Food[] newArray(int size) {
            return new Food[size];
        }
    };

    //CONSTRUCTOR
    Food(String name, int month, int drawablePath){
        this.name = name;
        this.month = month;
        this.drawablePath = drawablePath;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name =  newName;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int newMonth) {
        this.month =  newMonth;
    }

    public int getDrawablePath() {
        return drawablePath;
    }

    public void setDrawablePath(int newDrawablePath) {
        this.drawablePath =  newDrawablePath;
    }

    //PARCELLING PART

    public Food(Parcel in){
        this.name = in.readString();
        this.month = in.readInt();
        this.drawablePath =  in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeInt(this.month);
        dest.writeInt(this.drawablePath);
    }

    };

