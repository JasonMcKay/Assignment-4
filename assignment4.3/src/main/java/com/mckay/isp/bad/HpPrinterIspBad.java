package com.mckay.isp.bad;

/**
 * Created by Jason McKay on 2016/03/23.
 */
public class HpPrinterIspBad implements MachineServiceIspBad {
    public void print() {
        System.out.println("Printing job...");
    }

    public void copy() {
        System.out.println("Copying job...");
    }

    public void scan() {
        System.out.println("Cannot scan...");
    }

    public void staple() {
        System.out.println("Cannot staple...");
    }
}
