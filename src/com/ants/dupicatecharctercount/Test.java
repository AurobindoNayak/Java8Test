package com.ants.dupicatecharctercount;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 2, 2, 3, 4, 4, 4, 5, 5, 6);
        //identity is a static method inside function
        //identity means, what ever we give as input, it'll return the same to us
        //Here we can als replace function.identity() to x->x
        Map<Integer, Long> m = l.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(m);

        String name = "Helooo";
        Map<String, Long> collect = name.codePoints().mapToObj(Character::toString)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //to find only duplicate elements present in a list
        Set<Integer> set = new LinkedHashSet<>();
       // Set<Integer> l1 = l.stream().filter(x -> !set.add(x)).collect(Collectors.toSet());
        Set<Integer> l3 = l.stream().filter(x-> set.add(x)==false).collect(Collectors.toSet());
        System.out.println("l3 is"+l3);

        Map<Integer, Integer> integerMap = new LinkedHashMap<>();
        for (Integer i : l) {
            if (integerMap.containsKey(i)) {
                integerMap.put(i, integerMap.get(i) + 1);
            } else {
                integerMap.put(i, 1);
            }
        }
        System.out.println(integerMap);


        String s1 = "cricket";
        List<String> strings = Arrays.asList(s1.split(""));
        Map<String, Integer> m1 = new LinkedHashMap<>();
        for (String s : strings) {
            if (m1.containsKey(s)) {
                m1.put(s, m1.get(s) + 1);
            } else {
                m1.put(s, 1);
            }
        }
        System.out.println(m1);
    }


}
