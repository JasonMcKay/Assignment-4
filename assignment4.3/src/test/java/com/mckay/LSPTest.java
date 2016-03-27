package com.mckay;

import com.mckay.lsp.bad.*;
import com.mckay.lsp.good.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jason McKay on 2016/03/22.
 *
 * these test are to test Liskov substitution principle
 * (LSP), therefore you should be able to replace
 * the base class with a derived class without breaking
 * the program.
 */
public class LSPTest
{
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testLspBad() throws Exception {
        PrinterLspBad printLspBad = new PrinterLspBad();
        printLspBad.print(3);
        try {
            printLspBad.print(1, 2, 3);
        }catch(Exception e)
        {
            System.out.println("This printer cannot print in colour.");
        }
    }

    @Test
    public void testLspGood() throws Exception {
        ColourPrintLspGood printLspGood = new ColourPrintLspGood();
        NonColourPrintLspGood test = new NonColourPrintLspGood();
        test = printLspGood;  //<<----- to test Liskov
        printLspGood.print(1, 2, 3);

    }
}
