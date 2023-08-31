package com.driver;

public class Main {
    public static void main(String[] args) {
        B objB = new B();
        System.out.println(objB.meth());  // This will now call the overridden meth() from class B
    }
}

class A {
    String meth() {
        return "Invoking method from class A";
    }
}

class B extends A {
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}
