package com.mckay;

/**
 * Created by Jason McKay on 2016/03/21.
 */
public class Car
{
    private String make;
    private int yearModel;
    private Engine engine;
    private Suspension shocks;

    public Car(String make, int yearModel, int cc, double oilInLiters, String type, boolean spring) {
        this.make = make;
        this.yearModel = yearModel;
        this.engine = new Engine(cc, oilInLiters);
        this.shocks = new Suspension(type, spring);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYearModel() {
        return yearModel;
    }

    public void setYearModel(int yearModel) {
        this.yearModel = yearModel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(int cc, double oilInLiters) {
        this.engine = new Engine(cc, oilInLiters);
    }

    public Suspension getShocks() {
        return shocks;
    }

    public void setShocks(String type, boolean spring) {
        this.shocks = new Suspension(type, spring);
    }

    @Override
    public String toString() {
        return "*****Car*****" +
                "\nmake='" + make +
                "\nyearModel=" + yearModel +
                "\nengine= \ncc: " + engine.getCapacity() +
                "\nliters: " + engine.getLitersOfOil() +
                "\nshocks= \ntype: " + shocks.getType() +
                "\nsprings: " + shocks.isSprings();

    }
}
