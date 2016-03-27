package com.mckay.ocp.bad;

/**
 * Created by Jason McKay on 2016/03/22.
 * this class had to be modified to accomodate a new shapes area
 * which violates the OCP (Open Closed Principle)
 * before it would only accept rectangles and squares.
 */
public class CalculateAreaOcpBad
{
    public double area(Object shape)
    {
        double area = 0;
        if(shape.getClass() == RectangleOcpBad.class)
        {
            RectangleOcpBad rectangle = (RectangleOcpBad)shape;
            area = rectangle.getWidth() * rectangle.getHeight();
        }
        else
        {
            CircleOcpBad circle = (CircleOcpBad)shape;
            area = circle.getRadius() * circle.getRadius() * Math.PI;
        }

        return area;
    }
}
