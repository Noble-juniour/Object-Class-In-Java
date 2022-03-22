package com.company;

public class Main {

    public static void main(String[] args) {
     MyClass object1 = new Myclass("abcdefg");
     MyClass object2 = new Myclass("abcdefg");

        object1.MyMethod();
        object2.MyMethod();

        System.out.println("The objects are the same: "  + (object1 == object2));
        System.out.println("The objects are the equal: "  + object1.equals(object2));

    }
}
