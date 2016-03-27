package com.mckay.lsp.good;

/**
 * Created by Jason McKay on 2016/03/22.
 */
public class ColourPrintLspGood extends NonColourPrintLspGood {

    public void print(int baseX, int baseY, int baseZ)
    {
        super.print(baseX);
        System.out.println("printing in colour...");
    }
}
