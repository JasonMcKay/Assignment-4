package com.mckay.ocp.good;

/**
 * Created by Jason McKay on 2016/03/22.
 */
public class RectangleOcpGood extends Shape
{
    private double width;
    private double height;

    public RectangleOcpGood(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}
