package com.ants;

import java.util.function.Function;

public class Test {

    public static void main(String[] args) {
        Function<Integer,Integer> f = i->i*i;
        System.out.println(f.apply(5));

        A a = i->i*i;
        System.out.println(a.add(10));
    }
}
