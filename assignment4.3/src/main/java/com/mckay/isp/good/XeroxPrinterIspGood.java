package com.mckay.isp.good;

/**
 * Created by Jason McKay on 2016/03/23.
 */
public class XeroxPrinterIspGood implements PrintServiceIspGood, CopyServiceIspGood, ScanServiceIspGood, StapleServiceIspGood
{
    public void print() {
        System.out.println("Printing job...");
    }

    public void copy() {
        System.out.println("Copying job...");
    }

    public void scan() {
        System.out.println("Scanning job...");
    }

    public void staple() {
        System.out.println("Stapeling job...");
    }
}
