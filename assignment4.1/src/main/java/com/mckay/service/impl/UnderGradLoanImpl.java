package com.mckay.service.impl;

import com.mckay.domain.UnderGradLoanData;
import com.mckay.domain.StudentLoanData;
import com.mckay.service.LoanService;

/**
 * Created by Jason McKay on 2016/03/17.
 */
public class UnderGradLoanImpl extends StudentLoanData implements LoanService
{

    public StudentLoanData getLoan()
    {
        StudentLoanData undertGrad = new UnderGradLoanData("John Louw", "214076560", 17450.0);
        undertGrad.setInterestRate(0.14);
        return undertGrad;
    }
}
