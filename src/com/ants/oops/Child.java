package com.ants.oops;

public class Child extends Parent {

    public static void add(int a,int b) {
        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Parent p = new Child();
        Child c = (Child) p;
    }
}
