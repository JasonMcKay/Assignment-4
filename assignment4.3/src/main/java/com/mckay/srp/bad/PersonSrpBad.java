package com.mckay.srp.bad;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Jason McKay on 2016/03/22.
 */
public class PersonSrpBad
{
    private String name;
    private int age;
    private String email;

    public PersonSrpBad(String name, int age, String email) {
        this.name = name;
        this.age = age;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString()
    {
        return "Persons: " + getName() + ", "+ getAge() + "\nemail: " + getEmail();
    }
}
