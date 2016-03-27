package com.mckay;

import com.mckay.config.AppConfig;
import com.mckay.domain.StudentLoanData;
import com.mckay.service.LoanService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Jason McKay on 2016/03/17.
 */
public class CorePrinceplesTest
{
    private LoanService loans;
    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        loans = (LoanService)ctx.getBean("postGradLoan");
    }

    @Test
    public void testCorePrinciplesLoans() throws Exception
    {
        StudentLoanData student = loans.getLoan();
        System.out.println("Total Loan Amount Owed: R" + loans.getLoan().calculateTotalLoanAmount());
        System.out.println("Interest Rate Charged: " + (int)(student.getInterestRate() * 100) + "%");
        Assert.assertNotNull(student.getStudentName());
    }


}
