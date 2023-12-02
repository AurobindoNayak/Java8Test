package com.ants.altimetrik;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 2, 2, 3, 4, 5, 6, 6, 6);
        Set<Integer> s = new LinkedHashSet<>();
        Set<Integer> l = input.stream().filter(x -> s.add(x) == false).collect(Collectors.toSet());
        System.out.println(l);

        Map<Integer, Long> map = input.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map.forEach((k, v) -> {
            if (v > 1) {
                System.out.println(k);
            }
        });

        List<Integer> i = input.stream().distinct().collect(Collectors.toList());
        System.out.println(i);

        String name = "aaabbcc";
        List<Long> count = name.codePoints().mapToObj(x -> (char) x)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().map(Map.Entry::getValue).distinct().collect(Collectors.toList());
        //Map<String,Long> map1 = name.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        //System.out.println(map1);

        List<Long>  map1 = Arrays.asList(name.split("")).stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream().map(Map.Entry::getValue).distinct().collect(Collectors.toList());
        if(map1.size()==1){
          //  System.out.println("it's valid");
        }
        System.out.println(map1);
        Set<Long> set = new LinkedHashSet<>();

        Map<String,Long> map2 = Arrays.asList(name.split("")).stream().
                collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        map2.forEach((k,v)->{
            set.add(v);

        });
        if(set.size()==1){
            System.out.println("it's valid");
        }
    }

}


