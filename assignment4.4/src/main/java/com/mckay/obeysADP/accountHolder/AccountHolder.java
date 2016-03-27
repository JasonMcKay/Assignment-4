package com.mckay.obeysADP.accountHolder;

import com.mckay.obeysADP.bank.BankService;

/**
 * Created by Jason McKay on 2016/03/24.
 */
public class AccountHolder
{
    public void depositFunds(BankService bankService,String username, double depositAmount)
    {
        if(bankService.exists("jason"))
        {
            System.out.println("You deposited R" + depositAmount + " into " + username + " account");
        }
    }

    public double getBalance(String accountNumber)
    {
        System.out.println("Balance is ...");
        return 1.0;
    }
}
