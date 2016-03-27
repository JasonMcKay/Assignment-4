package com.mckay.service.impl;

import com.mckay.domain.PostGradLoanData;
import com.mckay.domain.StudentLoanData;
import com.mckay.service.LoanService;

/**
 * Created by Jason McKay on 2016/03/17.
 */
public class PostGradLoanImpl extends StudentLoanData implements LoanService
{

    public StudentLoanData getLoan()
    {
        StudentLoanData postGrad = new PostGradLoanData("Jason McKay", "214022560", 16250.0);
        postGrad.setInterestRate(0.13);
        return postGrad;
    }
}
