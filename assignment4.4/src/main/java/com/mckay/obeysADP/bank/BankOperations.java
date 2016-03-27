package com.mckay.obeysADP.bank;

/**
 * Created by Jason McKay on 2016/03/24.
 */
public class BankOperations
{
    private BankService bankService;

    public BankOperations(BankService bankService)
    {
        this.bankService = bankService;
    }

    public void doUserActions()
    {
        bankService.getUserBalance("1234");
    }
}
