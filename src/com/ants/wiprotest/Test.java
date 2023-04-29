package com.ants.wiprotest;

import com.sun.source.doctree.SeeTree;

import java.util.*;

public class Test {

    //it'll print only the number if 3 are in consugattive order

    public static void main(String[] args) {

        List<Integer> l = Arrays.asList(1, 2, 3, 10, 20, 21,4,100,101,102);
        Set<Integer> l1 = new LinkedHashSet<>();
        List<Object> l2 = new ArrayList<>();
        Collections.sort(l);
        int count = 0;
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) == l.get(i + 1) - 1) {
                l1.add(l.get(i));
                l1.add(l.get(i + 1));
                count++;
                if (count >= 2) {
                    l2.add(l1);
                    System.out.println(l2);
                    l2= new ArrayList<>();
                }
                //System.out.println(l2);
            } else {
                count = 0;
            }

        }


    }

}
