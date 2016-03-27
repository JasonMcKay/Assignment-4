package com.mckay.domain;

import java.io.Serializable;

/**
 * Created by Jason McKay on 2016/03/17.
 *
 * This file along with PostGradLoanData and UnderGradLoadData
 * are example of encapsulation and inheritance respectively.
 *
 */
abstract public class StudentLoanData implements Serializable
{
    private String studentName;
    private String studentNumber;
    private double amountLoaned;
    private double interestRate;
    private double totalAmountOwed;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public double getAmountLoaned() {
        return amountLoaned;
    }

    public void setAmountLoaned(double amountLoaned) {
        this.amountLoaned = amountLoaned;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double calculateTotalLoanAmount()
    {
        this.totalAmountOwed = amountLoaned + (amountLoaned * interestRate);
        return totalAmountOwed;
    }
}
