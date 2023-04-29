package com.ants.wiprotest;

import java.util.Arrays;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,10,20,21,4,5,100,101);
        for(int i = 0; i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
