package com.mckay;

import com.mckay.obeysADP.accountHolder.AccountHolder;
import com.mckay.obeysADP.bank.BankOperations;
import com.mckay.obeysADP.user.User;
import com.mckay.violatesADP.user.Users;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Jason McKay on 2016/03/24.
 *
 * These tests are to test acyclic dependencies principle
 * (ADP), therefore packages in an application should
 * always avoid cycle dependencies. A package should
 * never depend on another package, that depends on itself.
 */
public class ADPTest
{
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void testViolateADP() throws Exception {
        System.out.println("*****Violates ADP*****");
        Users user = new Users();
        user.depositFunds("jason", 500);
        user.getBalance("060789");

    }

    @Test
    public void testObeyADP() throws Exception {
        System.out.println("*****Obeys ADP*****");
        AccountHolder accountHolder = new AccountHolder();
        accountHolder.depositFunds(new User(), "jason", 1500);
        BankOperations bankOperations = new BankOperations(new User());
        bankOperations.doUserActions();

    }
}
