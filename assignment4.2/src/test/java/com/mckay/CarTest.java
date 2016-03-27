package com.mckay;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jason McKay on 2016/03/21.
 */
public class CarTest
{
    private Car car = new Car("Toyota", 1997, 1200, 1.6, "Oil filled", true);
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testCar1() throws Exception
    {
        //car = new Car("Toyota", 1997, 1200, 1.6, "Oil filled", true);
        System.out.println(car.toString());
        Assert.assertEquals(true, car.getShocks().isSprings());
    }

    @Test
    public void testCar2() throws Exception {
        car.getEngine().setCapacity(1250);
        System.out.println(car.toString());
        Assert.assertEquals(car.getEngine().getCapacity(), 1250);
    }
}
