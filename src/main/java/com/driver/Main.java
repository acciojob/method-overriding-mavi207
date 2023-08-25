package com.driver;

public class Main {

    public static void main (String [] args){
        B objB = new B();
        String strB=objB.meth();
        System.out.println(strB);
        String strA= objB.meth();
        System.out.println(strA);
    }
}