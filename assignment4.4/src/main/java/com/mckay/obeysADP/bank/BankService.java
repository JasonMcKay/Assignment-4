package com.mckay.obeysADP.bank;

/**
 * Created by Jason McKay on 2016/03/24.
 */
public interface BankService
{
    void depositFunds(BankService bankService, String username, double depositAmount);
    double getBalance(String accountNumber);
    double getUserBalance(String accountNumber);
    boolean exists(String username);
}
