package com.mckay.ocp.good;

/**
 * Created by Jason McKay on 2016/03/22.
 */
public class CircleOcpGood extends Shape
{
    private double radius;

    public CircleOcpGood(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
