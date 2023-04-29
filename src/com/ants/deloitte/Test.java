package com.ants.deloitte;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        int a = 2*2;
        int b = 3*3;

        List<Integer> l  = new ArrayList<>();
        l.add(a);
        l.add(b);

        for(int i:l){
            System.out.println(i+" ");
        }
    }
}
