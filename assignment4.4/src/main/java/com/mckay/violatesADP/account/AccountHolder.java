package com.mckay.violatesADP.account;

import com.mckay.violatesADP.user.Users;

/**
 * Created by Jason McKay on 2016/03/24.
 */
public class AccountHolder
{
    private Users user;

    public void depositFunds(String accountHolderName, double depositAmount)
    {
        user = new Users();
        if(user.exists(accountHolderName))
        {
            System.out.println("You deposited R" + depositAmount + " into " + accountHolderName + " account");
        }
    }

    public double getBalance(String accountNumber)
    {
        System.out.println("balance is ...");
        return 0;
    }
}
