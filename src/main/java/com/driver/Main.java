package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth from class A
        B objB = new B();
        String resultFromA = objB.meth(); // This will call the overridden method in class B

        // Task 5: Call the overridden method from objB of class B
        String resultFromB = objB.meth();
        // Print the result
    }
}

class A {
    public String meth() {
        return "Invoking method from class  A";
    }
}

// Task 2: Create a class B which extends class A
class B extends A {
    // Task 4: Override method meth in class B
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}
