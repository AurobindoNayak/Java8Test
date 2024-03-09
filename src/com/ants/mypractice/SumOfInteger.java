package com.ants.mypractice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfInteger {

    public static void main(String[] args) {
        int number = 123456;
        String s = String.valueOf(number);
        System.out.println(s);
        int sum = Arrays.asList(s.split("")).stream().mapToInt(Integer::parseInt).sum();
        int sum1= Arrays.asList(s.split("")).stream().map(x->Integer.parseInt(x)).reduce((x,y)->x+y).get();
        System.out.println(sum1);
    }
}
