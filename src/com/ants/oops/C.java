package com.ants.oops;

public class C implements A,B{

    @Override
    public void add() {
        System.out.println("Hi I'm from class");
    }

    public static void main(String[] args) {
        A a = new C();

    }
}
