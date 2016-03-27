package com.mckay;

import com.mckay.ocp.bad.CalculateAreaOcpBad;
import com.mckay.ocp.bad.CircleOcpBad;
import com.mckay.ocp.bad.RectangleOcpBad;
import com.mckay.ocp.good.CalculateAreaOcpGood;
import com.mckay.ocp.good.CircleOcpGood;
import com.mckay.ocp.good.RectangleOcpGood;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jason McKay on 2016/03/22.
 *
 * These test are to test open/close principle
 * (OCP), therefore all entities should be open
 * for extension but closed for modification.
 * Should only need to change once without
 * causing a ripple effect of changes to
 * dependant classes, modules, etc.
 */
public class OCPTest
{
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testOcpBad() throws Exception {
        RectangleOcpBad rectangle = new RectangleOcpBad(4, 6);
        CircleOcpBad circle = new CircleOcpBad(3);
        CalculateAreaOcpBad calcAreaOcpBad = new CalculateAreaOcpBad();
        System.out.println(calcAreaOcpBad.area(rectangle));
        System.out.println(calcAreaOcpBad.area(circle));
        Assert.assertEquals(calcAreaOcpBad.area(rectangle), 24.0);
    }

    @Test
    public void testOcpGood() throws Exception {
        RectangleOcpGood rectangle = new RectangleOcpGood(5, 10);
        CircleOcpGood circle = new CircleOcpGood(6);
        CalculateAreaOcpGood calcAreaOcpGood = new CalculateAreaOcpGood();
        System.out.println(calcAreaOcpGood.area(rectangle));
        System.out.println(calcAreaOcpGood.area(circle));
        Assert.assertEquals(calcAreaOcpGood.area(rectangle), 50.0);
    }
}
