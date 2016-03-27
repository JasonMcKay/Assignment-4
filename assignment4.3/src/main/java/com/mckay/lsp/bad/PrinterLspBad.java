package com.mckay.lsp.bad;

import java.rmi.UnexpectedException;

/**
 * Created by Jason McKay on 2016/03/22.
 */
public class PrinterLspBad
{
    public void print(int baseX)
    {
        System.out.println("printing in non colour...");
    }
    public void print(int baseX, int baseY, int baseZ)
    {
        throw new UnsupportedOperationException();
    }
}
