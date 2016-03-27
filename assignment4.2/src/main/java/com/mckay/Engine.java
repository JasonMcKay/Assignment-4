package com.mckay;

/**
 * Created by Jason McKay on 2016/03/21.
 */
public class Engine
{
    private int capacity;
    private double litersOfOil;

    public Engine(int cc, double oilInLiters)
    {
        this.capacity = cc;
        this.litersOfOil = oilInLiters;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getLitersOfOil() {
        return litersOfOil;
    }

    public void setLitersOfOil(double litersOfOil) {
        this.litersOfOil = litersOfOil;
    }
}
