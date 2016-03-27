package com.mckay.domain;

/**
 * Created by Jason McKay on 2016/03/18.
 * 
 * this file is a polymorphic example as
 * PostGradLoadData "IS A" student loan
 *               and "IS A " loan service
 */
public class PostGradLoanData extends StudentLoanData
{
    public PostGradLoanData(String studentName, String studentNumber, double amountLoaned)
    {
        super.setStudentName(studentName);
        super.setStudentNumber(studentNumber);
        super.setAmountLoaned(amountLoaned);
    }
}
