package com.mckay.isp.good;

/**
 * Created by Jason McKay on 2016/03/23.
 */
public class HpPrinterIspGood implements PrintServiceIspGood, CopyServiceIspGood {
    public void copy() {
        System.out.println("Copying job...");
    }

    public void print() {
        System.out.println("Printing job...");
    }
}
