package com.mckay.obeysADP.user;

import com.mckay.obeysADP.accountHolder.AccountHolder;
import com.mckay.obeysADP.bank.BankService;

/**
 * Created by Jason McKay on 2016/03/24.
 */
public class User extends AccountHolder implements BankService {
    public double getUserBalance(String accountNumber) {
        return getBalance(accountNumber);
    }

    public boolean exists(String username) {
        return true;
    }
}
