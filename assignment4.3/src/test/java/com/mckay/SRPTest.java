package com.mckay;

import com.mckay.srp.bad.PersonSrpBad;
import com.mckay.srp.good.EmailSrpGood;
import com.mckay.srp.good.PersonSrpGood;
import com.mckay.srp.good.PrintSrpGood;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jason McKay on 2016/03/22.
 *
 * these test are to test single-responsibility principle
 * (SRP), therefore the classes or modules should have
 * one and only one reason to change. Have only one
 * responsibility.
 */
public class SRPTest
{
    @Before
    public void setUp() throws Exception
    {


    }

    @Test
    public void testBadSrp() throws Exception
    {
        PersonSrpBad badSrpTest = new PersonSrpBad("jason", 22, "jman@cybersmart.co.za");
        Assert.assertNotNull(badSrpTest.getEmail());
        System.out.println(badSrpTest.toString());
    }

    @Test
    public void testGoodSrp() throws Exception
    {
        EmailSrpGood personEmail = new EmailSrpGood("jason@cybersmart.co.za");
        PersonSrpGood person = new PersonSrpGood("jason", 22, personEmail);
        Assert.assertNotNull(person.getEmail());
        PrintSrpGood printPerson = new PrintSrpGood(person);
        printPerson.print();
    }
}
