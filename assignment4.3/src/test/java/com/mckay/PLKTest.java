package com.mckay;

import com.mckay.plk.bad.PizzaPlkBad;
import com.mckay.plk.bad.ToppingsPlkBad;
import com.mckay.plk.good.CustomerOrderPlkGood;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jason McKay on 2016/03/23.
 *
 * theses tests test the principle of least knowledge
 * (PLK), this principle is used to avoid calling
 * a method on an object, whereby the reference to that
 * object is made by the reference to another object.
 * Overuse of the dot operator when invoking methods
 * on objects.
 */
public class PLKTest
{
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testPlkBad() throws Exception
    {
        PizzaPlkBad pizza = new PizzaPlkBad();
        pizza.setSize("Large");
        pizza.setPrice(35);
        pizza.getTopping().setType("Ham");
        pizza.getTopping().setPrice(8);
        pizza.print();
    }

    @Test
    public void testPlkGood() throws Exception
    {
        CustomerOrderPlkGood orderPizza = new CustomerOrderPlkGood();
        orderPizza.orderPizza();
        orderPizza.print();

    }
}
