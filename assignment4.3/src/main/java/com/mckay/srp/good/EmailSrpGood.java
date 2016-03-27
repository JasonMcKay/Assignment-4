package com.mckay.srp.good;

/**
 * Created by Jason McKay on 2016/03/22.
 */
public class EmailSrpGood
{
    private String email;

    public EmailSrpGood(String email)
    {
        String simple = "^(.+)@(.+)$";

        if(email.matches(simple))
        {
            this.email = email;
        }
        else
        {
            System.out.println("Wrong email");

        }
    }

    public String getEmailAddress()
    {
        return email;
    }
}
