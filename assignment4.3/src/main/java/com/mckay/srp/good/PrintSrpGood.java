package com.mckay.srp.good;

/**
 * Created by Jason McKay on 2016/03/22.
 */
public class PrintSrpGood
{
    PersonSrpGood person;

    public PrintSrpGood(PersonSrpGood person)
    {
        this.person = person;
    }

    public void print()
    {
        System.out.println("Person: " + person.getName() + ", " + person.getAge() + "\nEmail: " + person.getEmail());
    }
}
