package com.ants.genpact;

public class Child extends Parent{
    public static void m1(){
        System.out.println("child method");
    }

    public static void main(String[] args) {
        Parent p = new Child();
        p.m1();
    }
}
