package com.mckay;

/**
 * Created by Jason McKay on 2016/03/21.
 */
public class Suspension
{
    private String type;
    private boolean springs;

    public Suspension(String type, boolean springs) {
        this.type = type;
        this.springs = springs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSprings() {
        return springs;
    }

    public void setSprings(boolean springs) {
        this.springs = springs;
    }
}
