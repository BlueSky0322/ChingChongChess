package com.company;

import com.company.test;

public class Demo extends test {

    public void show(byte b)
    {
        System.out.println("In byte" + b);
    }

    public void show(Object o){
        System.out.println("In object" + o);
    }
}