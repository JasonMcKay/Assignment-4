package com.mckay.config;

import com.mckay.service.LoanService;
import com.mckay.service.impl.PostGradLoanImpl;
import com.mckay.service.impl.UnderGradLoanImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Jason McKay on 2016/03/18.
 */
@Configuration
public class AppConfig
{
    @Bean (name="postGradLoan")
    public LoanService getPostGradLoad()
    {
        return new PostGradLoanImpl();
    }

    @Bean (name="underGradLoan")
    public LoanService getUnderGradLoad()
    {
        return new UnderGradLoanImpl();
    }
}
