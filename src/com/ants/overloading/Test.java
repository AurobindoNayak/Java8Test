package com.ants.overloading;

public class Test {

    public int m1(int a){
        return 5;
    }

    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.m1('a'));
    }
}
