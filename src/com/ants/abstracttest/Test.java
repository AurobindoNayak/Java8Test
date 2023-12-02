package com.ants.abstracttest;

public abstract class Test {
    int x = 10;
    public static void main(String[] args) {
        System.out.println("Hello World");

        short s = 123;
        if(s == 123){
            s = Short.parseShort("hello");
        }
        System.out.println(s);
    }
}
