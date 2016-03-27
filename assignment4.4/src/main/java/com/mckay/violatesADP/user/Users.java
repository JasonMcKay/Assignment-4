package com.mckay.violatesADP.user;

import com.mckay.violatesADP.account.AccountHolder;

/**
 * Created by Jason McKay on 2016/03/24.
 */
public class Users extends AccountHolder
{
    public double getUserBalance(String accountNumber)
    {
        return getBalance(accountNumber);
    }

    public boolean exists(String accountHolderName)
    {
        return true;
    }
}
