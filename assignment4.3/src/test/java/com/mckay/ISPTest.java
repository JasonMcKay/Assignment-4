package com.mckay;

import com.mckay.isp.bad.HpPrinterIspBad;
import com.mckay.isp.bad.XeroxPrinterIspBad;
import com.mckay.isp.good.HpPrinterIspGood;
import com.mckay.isp.good.XeroxPrinterIspGood;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jason McKay on 2016/03/23.
 *
 *These tests are used to test interface segregation principle
 * (ISP), therefore it is better to use multiple interfaces,
 * as apposed to using one big polluted interface. An object
 * should use an interface for a single-role only.
 */
public class ISPTest
{
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testIspBad() throws Exception {
        System.out.println("*****Fat/Polluted Interface*****");
        XeroxPrinterIspBad printerMainOffice = new XeroxPrinterIspBad();
        printerMainOffice.print();
        printerMainOffice.copy();
        printerMainOffice.scan();
        printerMainOffice.staple();

        HpPrinterIspBad printerCoffeeRoom = new HpPrinterIspBad();
        printerCoffeeRoom.print();
        printerCoffeeRoom.copy();
        printerCoffeeRoom.scan();
        printerCoffeeRoom.staple();
    }

    @Test
    public void testIspGood() throws Exception {
        System.out.println("******Multiple interfaces******");
        XeroxPrinterIspGood printerMain = new XeroxPrinterIspGood();
        printerMain.print();
        printerMain.copy();
        printerMain.scan();
        printerMain.staple();

        HpPrinterIspGood printerLunchRoom = new HpPrinterIspGood();
        printerLunchRoom.print();
        printerLunchRoom.copy();
    }
}
