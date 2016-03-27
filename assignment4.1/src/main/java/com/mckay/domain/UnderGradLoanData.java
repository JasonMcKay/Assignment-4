package com.mckay.domain;

/**
 * Created by Jason McKay on 2016/03/18.
 *
 * this file is a polymorphic example as
 * UnderGradLoadData "IS A" student loan
 *               and "IS A " loan service
 */
public class UnderGradLoanData extends StudentLoanData
{
    public UnderGradLoanData(String studentName, String studentNumber, double amountLoaned)
    {
        super.setStudentName(studentName);
        super.setStudentNumber(studentNumber);
        super.setAmountLoaned(amountLoaned);
    }
}
