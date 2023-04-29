package com.ants.ust;

import java.util.*;
import java.util.stream.Collectors;

public class Test {

    public static void main(String[] args) {
       List<Integer> l1 = Arrays.asList(1,4,4,3,2,2);
       Set<Integer> s = new HashSet<>();
        List<Integer> l2 =l1.stream().filter(x->s.add(x)==true).collect(Collectors.toList());
        Collections.reverse(l2);
        System.out.println(l2);
    }
}
