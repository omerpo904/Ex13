package com.example.omerporat.ex13.data;

/**
 * Created by omer porat on 05/19/2017.
 */

public class Item {
    private long id;
    private int number;
    private int color;

    public Item(int number,long id,int color) {
        this.number = number;
        this.color=color;
        this.id=id;
    }
    public Item(int number,int color){this(-1,number,color);}

    public int getColor() {
        return color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(int color) {
        this.color = color;

    }

    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
